package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297;				// 총점
		int stNum = 4;				// 학생수
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + total/stNum + "입니다.");
		System.out.println();
		
		double average = 0.;		// 평균
		average = total / stNum;
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		
		average = 0.;		// 평균
		average =(double)total / stNum;
		// (double)total : 컴파일러에 의해 정수 total이 double로 강제 형변환
		/* 실수와 정수의 연산 결과는?
		 * 실수의 표현 범위 > 정수
		 * 결과값은 실수 자료형으로 나온다.
		 */
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		
		int nAvg = (int)average;
		System.out.println("평균은 " + nAvg + "입니다.");
		System.out.println();
		
		char ch = 'A';
		System.out.println(ch);
		//	char는 문자형이지만 숫자로 저장되기에 아래처럼 형변환 가능
		System.out.println((int)ch);
		System.out.println((int)'a');
		System.out.println((char)65);
		System.out.println((char)97);
		
		
	}

}
