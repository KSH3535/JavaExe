package ch09.abstract09;

public class Add extends Calc {

	// 추상 메서드 재정의
	@Override
	public int calculate() {
		return a + b;
	}
	
}
