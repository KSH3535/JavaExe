package ch05.array08;

public class SwapEx {

	public static void main(String[] args) {
		// 2개 변수의 값을 서로 바구려면
		/*
		 * Python은 아래처럼 가능하다
		 
		 	a = 10;
		 	b = 20;
		 	a, b = b, a;
		 */
		int a = 100;
		int b = 200;
		a = b;
		b = a;
		System.out.printf("a,= %d, b = %d\n", a, b );
		
		int c = 100;
		int d = 200;
		int temp = 0;
		
		temp = c;
		c = d;
		d = temp;
	
		System.out.printf("c,= %d, d = %d\n", c, d );
	}

}
