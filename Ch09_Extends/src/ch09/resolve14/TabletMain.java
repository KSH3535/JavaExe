package ch09.resolve14;

import ch09.resolve14.company.LG;
import ch09.resolve14.company.Samsung;
import ch09.resolve14.company.Sony;
import ch09.resolve14.order.TabletTester;

//ITablet 인터페이스를 만드세요.
//아래 메서드를 멤버로 추가하세요.
//void movie();
//void music();
//void readBook();
//
//ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고
//OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.
//이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.

public class TabletMain {

	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
				new Samsung(),
				new Sony(),
				new LG()
		};
		
		int[] score = new int[tabletArr.length];
		
		for (int i=0; i<tabletArr.length; i++) {
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.playMovie();
			System.out.printf("영화 재생 테스트 점수는 %d 입니다.\n", score[i]);
			score[i] += tabletTester.playMusic();
			System.out.printf("음악 재생 테스트 점수는 %d 입니다.\n", score[i]);
			score[i] += tabletTester.switchScreen();
			System.out.printf("화면 전환 테스트 점수는 %d 입니다.\n", score[i]);
			
			System.out.printf("\n전체 테스트 점수는 %d입니다.\n", score[i]);
			System.out.println("\n-----------------------------------------------------\n");
		}
		
		int max = score[0];
		int maxIdx = 0;
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 회사 제품이고, 점수는 %d 입니다.\n", maxIdx+1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}

}
