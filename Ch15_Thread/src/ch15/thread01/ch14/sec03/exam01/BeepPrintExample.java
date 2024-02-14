package ch15.thread01.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//비프음 발생
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}	//0.5초간 일시정지
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
