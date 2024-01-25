package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
//	정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//	   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
	
	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		
		System.out.println("정수 3개를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
		
		String result = (num1 + num2 > num3 ? "삼각형 입니다." : "삼각형이 아닙니다.");
		System.out.println(result);
		
		
		
	}

}
