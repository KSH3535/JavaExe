package ch03.while08;

public class WhileEx {

	public static void main(String[] args) {
		// while( ) : ( )가 true인 동안 계속 반복
		
		int i = 3;										// 초기식 (시작;언제부터)
		while(i < 10) {								// 조건식 (종료;언제까지)
			i++;											// 증감식 (변화;얼마만큼)
			System.out.print(i + ", ");			// 실행문
		}
	}

}
