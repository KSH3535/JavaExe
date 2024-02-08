package ch03.for10;

import java.util.Scanner;

public class Resolve12 {
//	양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
	
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("감사합니다");
		}
		
		
		sc.close();
	}

}
