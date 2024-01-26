package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {
// while문과 Scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와 같이
// 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하세요.
	
	public static void main(String[] args) {
		
		int money = 0;
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			
			if (choice==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (choice==1) {
				System.out.print("예금액>");
				int plus = sc.nextInt();
				money += plus;
			}
			else if (choice==2) {
				System.out.print("출금액>");
				int minus = sc.nextInt();
				money -= minus;
			}
			else if (choice==3) {
				System.out.printf("잔고>%d\n", money);
			}
			
			
//			switch(choice) {
//				case "1" -> {
//					System.out.print("예금액>");
//					int plus = sc.nextInt();
//					money += plus;
//				}
//				case "2" -> {
//					System.out.print("출금액>");
//					int minus = sc.nextInt();
//					money -= minus;
//				}
//				case "3" -> {
//					System.out.printf("잔고>%d\n", money);
//				}
//				case "4" -> {System.out.println("프로그램 종료");}
//			}
			
			sc.close();
		}
		
		
		
	}

}
