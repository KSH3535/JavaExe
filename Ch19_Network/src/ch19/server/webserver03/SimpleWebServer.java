package ch19.server.webserver03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	public static void main(String[] args) {
		final int PORT = 80;			// http는 디폴트로 80 Port를 사용, https는 443
		String mainThreadName = Thread.currentThread().getName();		// 메인 스레드의 이름 얻기
		
		try {
			// 현재 서버 프로세스가 동작하는 환경의 IP 주소를 자동으로 할당
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				System.out.printf("[서버-%s] 브라우저 접속을 대기합니다...\n", mainThreadName);
				Socket socket = serverSocket.accept();
				
				System.out.printf("[서버-%s] 새로운 쓰레드 시작합니다.\n", mainThreadName);
				HttpThread ht = new HttpThread(socket);
				ht.start();
				
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class HttpThread extends Thread {
	private Socket socket;
	
	public HttpThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			// 여기서는 Thread를 상속받았으므로 바로 getName()을 호출하면 작업 스레드 이름을 얻을 수 있음
			System.out.printf("[서버-%s] %s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			// 브라우저가 요청한 파일 찾기
			String line = br.readLine();
			System.out.println("line=" + line);
			int start = line.indexOf(" ") + 2;				// GET /a.html HTTP/1.1
			int end = line.lastIndexOf("HTTP") - 1;			//    공백뒤 두칸, HTTP 앞한칸 까지 글자 읽어오기
			System.out.println("start=" + start + ", end=" + end);
			String fileName = line.substring(start, end);
			System.out.println("fileName="+ fileName);
			if (fileName.equals(""))
				fileName = "index.html";
			System.out.printf("[서버-%s] 사용자가 %s를 요청했습니다.\n", getName(), fileName);
			
			// 요청한 파일을 읽어서 브라우저에 전달하기
			BufferedReader fileBr = new BufferedReader(new FileReader(fileName));
			String fileLine;
			while(true) {
				fileLine = fileBr.readLine();
				if (fileLine == null)
					break;
				pw.println(fileLine);
				pw.flush();
			}
			System.out.printf("[서버-%s] 브라우저에 %s를 전송했습니다.\n", getName(), fileName);
			
			fileBr.close();
			pw.close();
			br.close();
			
		} catch(Exception e) {
			System.out.printf("[서버-%s] %s\n", getName(), e.getMessage());
		}
	}
}
