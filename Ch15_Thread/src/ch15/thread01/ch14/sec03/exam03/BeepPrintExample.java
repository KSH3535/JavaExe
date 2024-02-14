package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	// main함수는 main스레드가 해야할 일
	public static void main(String[] args) {
		//1)작업 스레드 생성
		// 메인 스레드(주인아저씨)가 작업 스레드(알바생)를 고용한다
		Thread thread = new Thread() {
			@Override
			public void run() {
				//2-1)작업 스레드(알바생)가 실행하는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};
		
		//2)작업 스레드 실행
		thread.start();
		
		//3)메인 스레드가 실행하는 코드
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
