package ch03.for10;

import java.util.Scanner;

public class Resolve15 {
//	사용자로부터 정수를 입력받습니다.
//	   입력 받은 값을 계속 더합니다
//	   사용자가 0을 입력하면 합을 출력합니다
//	   프로그램을 종료합니다.
	
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		

		for(int i = 1; i > 0; i++) {
			System.out.print("정수를 입력하세요. 0을 입력하면 종료됩니다. >> ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if (num == 0)
				System.out.println("입력 받은 값의 합은 " + sum + "입니다.");
			
			sc.close();
			sum += num;
		}
	}

}
