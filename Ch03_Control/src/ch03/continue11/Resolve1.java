package ch03.continue11;

public class Resolve1 {
// for문을 이용해서 1부터 100까지의 정수 중에서
// 3의 배수의 총합을 출력하는 코드를 작성하세요.
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		
		System.out.printf("3의 배수의 총합은 %d 입니다.", sum);
	}

}
