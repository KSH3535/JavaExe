package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
//	정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//	   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
	
	public static void methodIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		System.out.print("3번째 숫자 입력 >> ");
		int num3 = sc.nextInt();
		
		boolean bTriangle = false;

		if (num1 + num2 > num3) {
			if (num2 + num3 > num1) {
				if (num1 + num3 > num2) {
					bTriangle = true;
				}
			}
		}
		
		System.out.println("삼각형의 조건이 " + bTriangle + " 입니다.");
		
		sc.close();
	}
	
	
	public static void methodCondOp() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		System.out.print("3번째 숫자 입력 >> ");
		int num3 = sc.nextInt();
		
		boolean bTriangle = false;
		
		boolean cond1 = num1 + num2 > num3;
		boolean cond2 = num2 + num3 > num1;
		boolean cond3 = num1 + num3 > num2;
		
		bTriangle = cond1 ? (cond2 ? (cond3 ? true : false) : false) : false;
		
		System.out.println("삼각형의 조건이 " + bTriangle + " 입니다.");
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		//methodIf();
		methodCondOp();
	}

}
