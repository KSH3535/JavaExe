package ch05.array04;

import java.util.Scanner;

public class Resolve5 {
//	int배열을 10개 생성하세요.
//	 사용자로부터 10개의 값을 입력받고
//	 순서대로 출력하고  총합을 구하세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int [10];
		int sum = 0;
		
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print((i+1) + "번째 숫자를 입력하세요 >> ");
//			nums[i] = sc.nextInt();
//			sum += nums[i];
//		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			sum += num;
			nums[i] = num;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		
		sc.close();
	}

}
