package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
//	입력받은 숫자의 구구단을 출력하세요
//	   예를 들어 3을 입력하면 
//	   3 x 1 = 3
//	   3 x 2 = 6
//	   ...
//	   3 x 9 = 27
	
	public static void main(String[] args) {
		int num = 0;
		int multiply = 0;
		System.out.print("1~9까지 중 숫자를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			multiply = num * i;
			System.out.printf("%d * %d = %d\n", num, i, multiply);
		}
		
		sc.close();
	}

}
