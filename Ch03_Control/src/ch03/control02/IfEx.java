package ch03.control02;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 정수 입력 >> ");
		score = sc.nextInt();
		
		// if문은 ( )괄호 안의 결과가 참일 때 { }소속 영역을 실행한다.
		if (score >= 90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("A학점은 아닙니다.");
		}
		
		sc.close();
	}

}
