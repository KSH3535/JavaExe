package ch02.logicOperator08;

import java.util.Scanner;

public class LogicCompOperator {

	public static void main(String[] args) {
		int score;
		String pass;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 시험 점수는? (0~100) >> ");
		score = sc.nextInt();
		System.out.print("당신의 면접 분위기는? (화목/공격) >> ");
		//	pass = sc.nextLine(); 은 개행이 포함됨
		pass = sc.next();
		
		// && And 연산은 양쪽 모두 true 일 때 true
		// if문은 결과값이 true일 때 { }내부영역의 코드를 실행
		if(score >= 90 && pass.equals("화목")==true) {
			System.out.println("당신은 합격입니다.");
		} else {
			System.out.println("당신은 더 좋은 곳이 있을거에요.");
		}
		
		sc.close();
	}

}