package ch14.exception01.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	
	public static void printLength(String data) {
		// data가 null일 경우 NullPointerException 발생
		int result = data.length();
		System.out.println("문자 수 : " + result);
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("thisIsJava");
		// 매개값으로 null을 대입
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
