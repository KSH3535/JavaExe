package ch19.server.jsonchatserver05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.json.JSONObject;

/* 1) EchoServer
 * 	- 서버소켓의 동작방식
 * 	- 2개 이상의 소켓 필요 (서버소켓(accept), 통신소켓(send/recv))	
 * 2) EchoMultiThreadServer
 * 	- 병렬 처리를 위해 client 1개당 Thread 1개를 배정
 * 3)JsonChatServer
 * 	- 다양한 업무처리를 위해서 Json 포맷 사용 (패킷)
 * 	- 채팅은 1사람한테 수신된 데이터를 다른 사람한테 전달해야 한다.
 	  그러므로 사용자 등록/관리가 필요하다. 해시테이블을 사용해서 (HashTable = HashMap + 동기화)
 */

public class JsonChatServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		// Client 접속자를 관리하는 테이블
		Hashtable clientHT = new Hashtable();
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			// 반복문을 이용해 main thread는 계속 accept() 처리를 담당
			while(true) {
				System.out.printf("[서버=%s] Client 접속을 기다립니다...\n", mainThreadName);
				Socket socket = serverSocket.accept();
			
				// worker thread는 Client와의 통신을 담당
				WorkerThread wt = new WorkerThread(socket, clientHT);
				wt.start();
			
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


/* [App 프로토콜 정의]
 * 1) 데이터는 '문자열' 데이터로 한다.
 * 2) '문자열' 데이터는 json을 변환한 것으로 한다.
 * 3) json 명령 패킷 종류
 * 	  { }내의 데이터는 값을 의미
 * 	3-1) id 등록
 * 		   [요청]
 * 			cmd: ID
 * 			id: {id값}
 * 
 * 		   [응답]
 * 			cmd: ID
 * 			aclk: ok(성공), fail(실패)
 * 
 * 	3-2) 사칙 연산
 *  	   [요청]
 * 			cmd: ARITH
 * 			id: {id값}
 * 			op: {연산자}
 * 			val1: {첫번째값}
 * 			val2: {두번째값}
 * 
 * 		   [응답]
 * 			cmd: ARITH
 * 			ack: {결과값}
 * 
 * 	3-3) 전체 채팅
 * 		   [요청]
 * 			cmd:: ALLCHAT
 * 			id: {id값}
 * 			msg: {문자메시지}
 * 
 * 		   [응답]
 * 			cmd: ID
 * 			aclk: ok(성공), fail(실패)
 * 
 * 		   [전송]
 * 			cmd: BROADCHAT
 * 			id: {id값}
 * 			msg: {문자메시지}
 * 
 * 	3-4) 1:1 채팅
 * 		   [요청]
 * 			cmd: ONECHAT
 * 			id: {id값}
 * 			yourid: {상대id}
 * 			msg: {문자메시지}
 * 
 * 		   [응답]
 * 			cmd: ID
 * 			aclk: ok(성공), fail(실패)
 * 
 *		   [전송]
 * 			cmd: UNICHAT
 * 			id: {id값}
 * 			msg: {문자메시지}
 */

/* JSON 라이브러리 다운로드 후 등록
 1) https://github.com/stleary/JSON-java
 2) Click here if you just want the latest release jar file.
 3) 프로젝트 폴더 내 lib 폴더 내에 복사
 4) 해당 프로젝트패키지 마우스오른쪽클릭 -> Build Path
 	-> Add External Archives to Java Build Path
 	->json.jar파일 선택
 	(import안될경우 module-info.java 삭제 혹은 설정)
 */


class WorkerThread extends Thread {
	private Socket socket;
	private Hashtable ht;
	
	public WorkerThread(Socket socket, Hashtable ht) {
		this.socket = socket;
		this.ht = ht;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("[서버-%s] %s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		
			while(true) {
				/* Client가 JSON 오브젝트를 String으로 변환해서 보낸 것을 수신 */
				String line = br.readLine();
				if (line==null)
					break;
				/* JSON 패킷을 해석해서 알맞은 처리를 한다.
				 * 문자열 -> JSONObject 변환 -> cmd를 해석해서 어떤 명령인지?
				 */
				JSONObject packetObj = new JSONObject(line);
				/* 명령당 알맞은 처리 */
				processPacket(packetObj);
				
			}
		
		} catch(Exception e) {
			System.out.printf("[서버-%s] %s\n", getName(), e.getMessage());
		}

	}
	
	private void processPacket(JSONObject packetObj) throws IOException {
		JSONObject ackObj = new JSONObject();
		// 어떤 종류의 패킷을 보냈는지 분류하기 위한 정보
		String cmd = packetObj.getString("cmd");
		
		// id 정보 등록
		if(cmd.equals("ID")) {
			// 클라이언트 [요청] 처리
			String id = packetObj.getString("id");
			ht.put(id, this.socket);			// id와 socket을 해시테이블에 등록
			
			// [응답]
			ackObj.put("cmd", "ID");
			ackObj.put("ack", "ok");
			
			// JSON Obj -> 문자열
			String ack = ackObj.toString();
			
			// 클라이언트한테 [전송]
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
		}
		// 사칙 연산 업무 결과 요청
		else if(cmd.equals("ARITH")) {
			// [요청] 처리
			String id = packetObj.getString("id");
			String op = packetObj.getString("op");
			String val1 = packetObj.getString("val1");
			String val2 = packetObj.getString("val2");
			
			double v1 = Double.parseDouble(val1);
			double v2 = Double.parseDouble(val2);
			double result = arith(op, v1, v2);
			
			// [응답]
			ackObj.put("cmd", "ARITH");
			ackObj.put("ack", Double.toString(result));
			
			// JSON Obj -> 문자열
			String ack = ackObj.toString();
			
			// 클라이언트한테 [전송]
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
		}
		// 접속자 전체한테 채팅메시지 전송
		else if(cmd.equals("ALLCHAT")) {
			String id = packetObj.getString("id");
			String msg = packetObj.getString("msg");

			/* 클라이언트 응답 패킷 */
			// 응답
			ackObj.put("cmd", "ALLCHAT");
			ackObj.put("ack", "ok");
			
			// Json Obj -> 문자열
			String ack = ackObj.toString();
			
			// 클라이언트한테 전송
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
			// 전체 전송 패킷
			JSONObject broadObj = new JSONObject();
			ackObj.put("cmd", "BROADCHAT");
			ackObj.put("id", id);
			ackObj.put("msg", "msg");
			String strBroad = broadObj.toString();
			
			// 전체 [전송]
			broadcast(strBroad);
			
		}
		// 특정 id대상한테 1:1 채팅메시지 전송
		else if(cmd.equals("ONECHAT")) {
			String id = packetObj.getString("id");
			String yourid = packetObj.getString("yourid");
			String msg = packetObj.getString("msg");
			
			/* 클라이언트 응답 패킷 */
			// 응답
			ackObj.put("cmd", "ONECHAT");
			ackObj.put("ack", "ok");
			
			// Json Obj -> 문자열
			String ack = ackObj.toString();
			
			// 클라이언트한테 전송
			OutputStream out = this.socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(ack);
			pw.flush();
			
			// 특정 yourid 사용 클라이언트에 전송 패킷
			JSONObject uniObj = new JSONObject();
			ackObj.put("cmd", "UNICHAT");
			ackObj.put("id", id);
			ackObj.put("msg", "msg");
			String strUni = uniObj.toString();
			
			// 전체 [전송]
			unicast(strUni, yourid);
		}
	}
	
	
	// yourId에 해당하는 접속자를 찾아서 패킷을 전송
	private void unicast(String packet, String yourid) throws IOException {
		Socket sock = (Socket) ht.get(yourid);
		
		OutputStream out = sock.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		pw.println(packet);
		pw.flush();
	}
	
	
	// 접속 클라이언트를 제외한 모든 접속자한테 패킷을 전송
	private void broadcast(String packet) throws IOException {
		// 현재 Hashtable에 등록된 모든 사용자의 id와 Socket을 가져온다.
		Set<String> idSet = ht.keySet();
		Iterator<String> idIter = idSet.iterator();
		while(idIter.hasNext()) {
			String id = idIter.next();
			Socket sock = (Socket) ht.get(id);
			
			/* 메시지를 보내온 클라이언트한테는 보낼 필요가 없으므로 */
			if(sock==this.socket)
				continue;
			
			OutputStream out = sock.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			pw.println(packet);
			pw.flush();
		}
	}
	
	
	private double arith(String op, double val1, double val2) {
		double result = 0.;
		
		switch(op) {
		case "+":
			result = val1 + val2;
			break;
		case "-":
			result = val1 - val2;
			break;
		case "*":
			result = val1 * val2;
			break;
		case "/":
			result = val1 / val2;
			break;
		}
		return result;
	}
}
