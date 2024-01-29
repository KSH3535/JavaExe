package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
// 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//	   작은 값을 반환하는 메서드를 작성하고 사용하세요
	
	public static int large(int num, int num1) {
		int result = (num > num1) ? num : num1;
		return result;
	}
	
	
	public static int small(int num, int num1) {
		int result = (num < num1) ? num : num1;
		return result;
	}
	
	
	public static void viewResult(int result) {
		System.out.println("2개의 정수 중 큰 값은 " + result + "입니다.");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		System.out.print("정수 입력 >> ");
		int num1 = sc.nextInt();
		
		int result1 = large(num, num1);
		int result2 = small(num, num1);
		
		viewResult(result1);
		viewResult(result2);
		
		
		
		sc.close();
		
		
	}

}
