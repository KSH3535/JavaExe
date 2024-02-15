package ch18.fileio01.byteStream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException  {
		
		/*--------------1) 스트림 연결--------------*/
//		InputStream in = new FileInputStream("cat.jpg");
//		OutputStream out = new FileOutputStream("고양이.jpg");
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("푸푸티티.exe");
		/*--------------2) 스트림 입출력------------*/
		int copyByte = 0;
		int readLen;
		//한번에 읽어들인다
		//ByteFileCopy.java에서 한바이트씩 읽어들인것보다 시간이 단축됨
		byte[] buf = new byte[1024];			
		long stime = System.currentTimeMillis();
		while(true) {
			//읽을 때 buf 배열크기만큼 읽으려고 시도
			//실제 읽어들인 byte 크기는 readLen
			readLen = in.read(buf);		
			//더이상 읽을것이 없으면
			if(readLen == -1)
				break;
			//buf에서 실제 읽어들인 크기만큼 저장
			out.write(buf, 0, readLen);
			//읽어들인 크기를 누적
			copyByte += readLen;
		}
		long etime = System.currentTimeMillis();
		/*--------------3) 스트림 종료--------------*/
		in.close();
		out.close();
		System.out.println("복사 시간 = " + (etime-stime));
		System.out.println("복사된 바이트 크기 : " + copyByte);
	}
}
