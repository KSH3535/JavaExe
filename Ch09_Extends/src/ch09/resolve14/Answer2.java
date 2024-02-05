package ch09.resolve14;

import java.util.Scanner;



public class Answer2 implements IQuestionAnswer {

	@Override
	public void question() {
		String question ="2. ITablet 인터페이스를 만드세요.\r\n"
				+ "아래 메서드를 멤버로 추가하세요.\r\n"
				+ "void movie();\r\n"
				+ "void music();\r\n"
				+ "void readBook();\r\n"
				+ "\r\n"
				+ "ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\r\n"
				+ "OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\r\n"
				+ "이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.";
		
		System.out.println(question);
		System.out.println();
	}	

	@Override
	public void answer(Scanner sc) {
		
		sc.nextLine();														
		System.out.println("2번 문제 실행~!");
		sc.nextLine();	
	}

}
