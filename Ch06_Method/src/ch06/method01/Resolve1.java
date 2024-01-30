package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
// 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//	   작은 값을 반환하는 메서드를 작성하고 사용하세요
	
	public static int large(int a, int b) {
//		int result = (a > b) ? a : b;
//		return result;
		return ( a > b) ? a : b;
	}
	
	public static int small(int a, int b) {
		int result = (a < b) ? a : b;
		return result;
	}
	
	public static void viewResult(int small, int large) {
		System.out.printf("작은 값 : %d. 큰 값 : %d\n", small, large);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		System.out.print("정수 입력 >> ");
		int num1 = sc.nextInt();
		
		viewResult(small(num, num1), large(num, num1));
		
		sc.close();
	}

}
