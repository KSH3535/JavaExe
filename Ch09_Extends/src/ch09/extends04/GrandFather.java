package ch09.extends04;

public class GrandFather {
	int handSomeScore;
	
	GrandFather() {
		System.out.println("GrandFather 생성자 ");
	}
	
	GrandFather(int score) {
		System.out.println("GrandFather 매개변수 생성자 ");
	}
	
	void handsome() {
		System.out.println("잘생겼다~");
	}
}
