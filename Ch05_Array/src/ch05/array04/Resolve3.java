package ch05.array04;

import java.util.Scanner;

public class Resolve3 {
// 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < 7; i++) {
			System.out.println((i+1) + "학생 학점 입력 >> ");
			int score = sc.nextInt();
			total += score;
		}
		
		avg = (double)total / 7;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg) ;
		
		sc.close();
		
		
		
//		int[] grade = new int[7];
//		int sum = 0;
//		double avg = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < grade.length; i++) {
//			System.out.print((i+1) + "번째 학생의 학점을 입력하세요 >> ");
//			grade[i] = sc.nextInt();
//			sum += grade[i];
//		}
//		
//		avg = (double)sum / grade.length;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg) ;
//		
//		sc.close();
	}

}
