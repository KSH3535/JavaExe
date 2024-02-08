package ch03.doWhile09;

public class DoWhileEx {

	public static void main(String[] args) {
		// 1~10까지 출력
		
		// while문은 조건을 검사하고 실행하는 반면
		// do-while문은 1번은 무조건 실행하고 난 후, 조건을 검사하여 반복을 결정
		int i = 1;									// 초기식
		do {
			System.out.println(i);				// 실행문
			i++;										// 증감식
		} while(i <= 10);						// 조건식
	}

}
