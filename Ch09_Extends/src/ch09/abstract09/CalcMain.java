package ch09.abstract09;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Add add = new Add();
		add.setValue(20, 10);
		System.out.println(add.calculate());
		
		Sub sub = new Sub();
		sub.setValue(20,10);
		System.out.println(sub.calculate());
		
		Mul mul = new Mul();
		mul.setValue(20,10);
		System.out.println(mul.calculate());
		
		Div div = new Div();
		div.setValue(20,10);
		System.out.println(div.calculate());
		
		//============================================
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		
		
		while (isRun) {
			
			/* 자식 개겣는 부모의 클래스 변수에 저장할 수 있다.
			 * 객체 지향 언어의 특징
			 * 관리의 편의성 (코드를 줄일 수 있다)
			 */
			
			Calc[] calcs = new Calc[] {add, sub, mul, div};
			
			System.out.println("[2개의 정수 입력 후 연산]");
			System.out.print("첫번째 수 입력 >> ");
			int num = sc.nextInt();
			System.out.print("두번째 수 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("연산 선택(0. Add, 1. Sub, 2. Mul, 3. Div, 4. Exit) >> ");
			int sel = sc.nextInt();
			
			if (sel == 4)
				isRun = false;
			else {
				calcs[sel].setValue(num, num1);
				System.out.println("결과는 " + calcs[sel].calculate());
			}
		}
		
		System.out.println("Program End!");
		
		sc.close();
	}

}
