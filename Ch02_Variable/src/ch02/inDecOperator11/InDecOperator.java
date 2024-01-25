package ch02.inDecOperator11;

public class InDecOperator {

	public static void main(String[] args) {
		int num = 0;
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		
		// 후위 증감 연산자
		// num의 값을 대입한 후 num이 1 증가
		int result = num++;
		System.out.println("result = " + result);
		System.out.println("num = " + num);
		
		// 전위 증감 연산자
		// num을 1 증가한 후 대입
		result = ++num;
		System.out.println("result = " + result);
		System.out.println("num = " + num);
		
		
		
//		num--;
//		System.out.println("num = " + num);
		
		System.out.println("num = " + num--);
		System.out.println("num = " + --num);
	}

}
