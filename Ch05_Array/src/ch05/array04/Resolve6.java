package ch05.array04;

import java.util.Scanner;

public class Resolve6 {
//	5명의 학생의 이름과 점수를 입력받고
//	   해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//	  A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] students = new String[5];
		int[] score = new int[5];
		
		for (int i = 0; i < students.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 >> ");
			students[i] = sc.nextLine();
			
		}
		for (int j = 0; j < score.length; j++) {
			System.out.print((j+1) + "번째 학생의 점수를 입력하세요 >> ");
			score[j] = sc.nextInt();
		}
		for (int i = 0; i < students.length; i++) {
			if (score[i] >= 90)
				System.out.println(students[i] + " A");
			else if (score[i] >= 90)
				System.out.println(students[i] + " A");
		}
		
		
		
		sc.close();
	}

}
