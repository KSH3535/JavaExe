package ch09.extends04;

public class Father extends GrandFather {
	long money = 1000000000000000L;
	
	Father() {
		System.out.println("Father 생성자");
	}
	
	Father(int score, long money) {
		super(score);												// GrandFather의 매개변수 생성자 호출
																		// GrandFather 클래스에서 handSomeScore를 private로 설정하지 않았기 때문에 사실?
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다");
	}
}
