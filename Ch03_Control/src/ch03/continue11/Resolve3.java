package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {
// while문과 Scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와 같이
// 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하세요.
		
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int input = 0;
		boolean isRun = true;
		
		while(isRun) {
			
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 -> {
					System.out.print("예금액>");
					input = sc.nextInt();
					money += input;
					break;
				}
				case 2 -> {
					System.out.print("출금액>");
					input = sc.nextInt();
					money -= input;
					break;
				}
				case 3 -> {
					System.out.printf("잔고>%d\n", money);
					break;
				}
				case 4 -> {
					isRun = false;
					break;
				}
			}
			
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
	
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		String input;
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1" -> {
				System.out.print("예금액>");
				input = sc.nextLine();
				money += Integer.parseInt(input);
				// 교재 71p 참고
				break;
			}
			case "2" -> {
				System.out.print("출금액>");
				input = sc.nextLine();
				money -= Integer.parseInt(input);
				break;
			}
			case "3" -> {
				System.out.printf("잔고>%d\n", money);
				break;
			}
			case "4" -> {
				isRun = false;
				break;
			}
			}
		
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
//		method1();
		method2();
	}

}
