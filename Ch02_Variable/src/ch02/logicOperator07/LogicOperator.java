package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		// And 연산
		// 둘 다 true여야 true
		logic = true && true;
		System.out.println("true && true -> " + logic);
		logic = true && false;
		System.out.println("true && false -> " + logic);
		
		// Or 연산
		// 둘 중 하나만 true여도 true
		logic = true || true;
		System.out.println("true || true -> " + logic);
		logic = true || false;
		System.out.println("true || false-> " + logic);
		logic = false || false;
		System.out.println("false || false -> " + logic);
		
		// Xor 연산
		// 둘 중 하나만 true여야  true
		logic = true ^ true;
		System.out.println("true ^ true -> " + logic);
		logic = false ^ false;
		System.out.println("false ^ false -> " + logic);
		
		// Not 연산
		logic = !false;
		System.out.println("!false -> " + logic);
		
	}

}
