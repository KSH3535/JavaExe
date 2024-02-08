package ch03.while08;

public class Resolve4 {
// while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
	
	public static  void method1() {
		int i = 0;
	
		while(i<10) {
			i++;
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}
	
	public static  void method2() {
		int num = 2;
	
		while(num<=10) {
			System.out.print(num + " ");
			num+=2;
		}
	}
	
	public static void main(String[] args) {
//		int i = 0;
//		
//		while (i<10) {
//			i+=2;
//			System.out.print(i + " ");
//		}
		method1();
		method2();
		
		
	}

}
