package ch09.resolve14;

import java.util.Scanner;

public class QuestionMain {
	
	IQuestionAnswer[] qaArr = {
			new Answer1(),
			new Answer2(),
			new Answer3()
	};
	
	public int getSelectQuestion(Scanner sc) {
		System.out.println("\n\n문제 번호 선택 >> ");
		int num =  sc.nextInt();
		return num;
	}
	
	public void printQuestion() {
		for (int i=0; i<qaArr.length; i++) {
			qaArr[i].question();
		}
	}
	
	public static void main(String[] args) {
		QuestionMain qm = new QuestionMain();
		
		Scanner sc = new Scanner(System.in);
		boolean isRun  = true;
		
		while(isRun) {
			qm.printQuestion();
			int sel = qm.getSelectQuestion(sc);
			
			// 1이상 ~ 3이하의 값 입력
			if (sel >= 1 && sel <= qm.qaArr.length) {
				// 0이상 ~ 2이하의 인덱스로 변환
				IQuestionAnswer iqa  = qm.qaArr[sel -1];
				iqa.answer(sc);
			} else {
				System.out.println("문제 번호 잘못 선택했습니다.");
			}
		}
		System.out.println("Program End~!");
		
		sc.close();
	}
}
