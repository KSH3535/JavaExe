package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question02.ITablet;
import ch09.resolve14.question02.factory01.LGTablet;
import ch09.resolve14.question02.factory01.SamsungTablet;
import ch09.resolve14.question02.factory01.SonyTablet;
import ch09.resolve14.question02.order01.TabletTester;



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
				+ "이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\n\n";
		
		System.out.println(question);
	}	

	@Override
	public void answer(Scanner sc) {
		
		sc.nextLine();														
		
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
					new SamsungTablet(),
					new LGTablet(),
					new SonyTablet()
			};
			
			int[] score = new int[tabletArr.length];
			
			for (int i=0; i<tabletArr.length; i++) {
				tabletTester.setTablet(tabletArr[i]);
				
				int movie = 0, music = 0, readBook = 0;
				
				try {
					movie = tabletTester.moiveTest();
					System.out.printf("movie 테스트 점수는 %d입니다\n", movie);
					music = tabletTester.musicTest();
					System.out.printf("music 테스트 점수는 %d입니다\n",music);
					readBook = tabletTester.readBookTest();
					System.out.printf("readBook 테스트 점수는 %d입니다\n", readBook);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
				
				score[i] = movie + music + readBook;
				
				System.out.printf("전체 테스트 점수는 %d입니다.\n", score[i]);
				System.out.println("-----------------------------------------------------");
			}
			
			//가장 큰 점수를 받은 값과 인덱스 찾기
			int max = score[0];
			int maxIdx = 0;
			for (int i=1;i<score.length;i++) {
				if(max < score[i]) {
					max = score[i];
					maxIdx = i;
				}
			}
			
			System.out.printf("가장 높은 점수를 받은 태블릿은 %d 번째 태블릿이고, 점수는 %d 입니다.\n", maxIdx+1, max);
			System.out.println(tabletArr[maxIdx].getClass().getName());
			
			sc.nextLine();	
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
