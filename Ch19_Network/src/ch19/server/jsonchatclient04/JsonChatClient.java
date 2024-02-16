package ch19.server.jsonchatclient04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class JsonChatClient {
	
	// 패킷이 서버로 전송되어 응답을 기다리는 중... 을 나타내는 변수
	static boolean isPending = false;
	
	public static void main(String[] args) {
//		final String IP = "127.0.0.1";
		final String IP = "192.168.0.50";
		final int PORT = 9000;
		String id = "";
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		Scanner sc = null;
		
		try {
			// 서버를 주소를 찾아서 연결
			socket = new Socket(IP, PORT);
			
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			sc = new Scanner(System.in);
			
			// 별도의 worker 스레드를 생성해서 서버로부터의 수신을 담당한다.
			ReceiveThread rt = new ReceiveThread(br);
			rt.start();
			
			// main 스레드는 서버에 전송을 담당한다.
			// 1)id를 서버에 등록한다.
			id = sendId(sc, pw);
			Thread.sleep(300);
			
			// 2)메뉴를 선택해서 원하는 요청을 서버로 보낸다.
			boolean isRun = true;
			while(isRun) {
				if(JsonChatClient.isPending)
					continue;
				int sel = getSelectMenu(sc);
				switch(sel) {
				case ServiceMenu.ALL_CHAT:
					sendAllChat(sc, pw,id);
					break;
				case ServiceMenu.ONE_CHAT:
					break;
				case ServiceMenu.CALC_ARITH:
					JsonChatClient.isPending = true;
					sendArith(sc, pw, id);
					break;
				case ServiceMenu.EXIT:
					isRun = false;
					break;
				}
			}
			System.out.println("Client 프로그램 종료");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			if (socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			sc.close();
		}
	}
	
	
	public static void sendAllChat(Scanner sc, PrintWriter pw, String id) {
		boolean isRun = true;
		
		while(isRun) {
			System.out.print("전송 메시지 (quit는 종료) >> ");
			String msg = sc.nextLine();
			if(msg.equals("quit")) {
				isRun = false;
				break;
			}
			
			JSONObject packetObj = new JSONObject();
			packetObj.put("cmd", "ALLCHAT");
			packetObj.put("id", id);
			packetObj.put("msg", msg);
			
			String packet = packetObj.toString();
			
			pw.println(packet);
			pw.flush();
		}
		
		
	}
	
	
	public static void sendArith(Scanner sc, PrintWriter pw, String id) {
		System.out.print("연산자 입력(+ - * /) >> ");
		String op = sc.nextLine();
		System.out.print("첫 번째 숫자 입력 >> ");
		String num1 = sc.nextLine();
		System.out.print("두 번째 숫자 입력 >> ");
		String num2 = sc.nextLine();
		
		JSONObject packetObj = new JSONObject();
		packetObj.put("cmd", "ARITH");
		packetObj.put("id", id);
		packetObj.put("op", op);
		packetObj.put("val1", num1);
		packetObj.put("val2", num2);
		
		String packet  = packetObj.toString();
		
		pw.println(packet);
		pw.flush();
		
		
	}
	
	
	public static int getSelectMenu(Scanner sc) {
		System.out.println("1. 전체 채팅");
		System.out.println("2. 1:1 채팅");
		System.out.println("3. 사칙 연산");
		System.out.println("4. exit");
		System.out.print("번호 입력 >> ");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	
	
/* 3-1) id 등록
	[요청]
cmd: ID
id: {id값}

	[응답]
ack: ok(성공), fail(실패)
 */
	public static String sendId(Scanner sc, PrintWriter pw) {
		System.out.print("당신의 id 입력 >> ");
		String id = sc.nextLine();
		
		// 프로토콜(약속)에 의한 요청 패킷 구성
		JSONObject idObj = new JSONObject();
		idObj.put("cmd", "ID");
		idObj.put("id", id);
		
		// 문자열 변환
		String packet = idObj.toString();
		pw.println(packet);
		pw.flush();
		
		return id;
	}
}



class ReceiveThread extends Thread {
	private BufferedReader br = null;
	
	public ReceiveThread(BufferedReader br) {
		this.br = br;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String packet = br.readLine();
				if(packet==null)
					break;
				JSONObject packetObj = new JSONObject(packet);
				processPacket(packetObj);
				JsonChatClient.isPending = false;
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void processPacket(JSONObject packetObj) {
		String cmd = packetObj.getString("cmd");
		
		// 서버의 id처리에 대한 응답
		if(cmd.equals("ID")) {
			String ack = packetObj.getString("ack");
			if(ack.equals("ok"))
				System.out.println("[서버 응답] ID 등록 성공");
			else if(ack.equals("fail"))
				System.out.println("[서버 응답] ID 등록 실패");
			else
				System.out.printf("[서버 응답] ID 등록 %s\n", ack);
		}
		// 서버의 사칙연산 결과 응답
		else if(cmd.equals("ARITH")) {
			String ack = packetObj.getString("ack");
			
			System.out.println("[서버 응답] 연산 결과 = " + ack);
		}
		// 서버의 전송 채팅에 대한 응답
		else if(cmd.equals("ALLCHAT")) {
			String ack = packetObj.getString("ack");
			if(ack.equals("ok"))
				System.out.println("[서버 응답] 채팅 전송 성공");
			else if(ack.equals("fail"))
				System.out.println("[서버 응답] 채팅 전송 실패");
			else
				System.out.printf("[서버 응답] 채팅 전송 %s\n", ack);
		}
		// 서버의 1:1 채팅에 대한 응답
		else if(cmd.equals("ONECHAT")) {
			
			
		}
		// 다른사람의 채팅 메시지를 수신하여 서버가 전송
		else if(cmd.equals("BROADCHAT")) {
			String id = packetObj.getString("id");
			String msg = packetObj.getString("msg");
			System.out.printf("채팅 메시지 [%s] %s\n", id, msg);
			
		}
		// 특정사람이 나의 id로 보낸 메시지를 서버가 전송
		else if(cmd.equals("UNICHAT")) {
			
		}
	}
}




