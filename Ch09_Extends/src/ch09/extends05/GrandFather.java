package ch09.extends05;

public class GrandFather {
	private int handSomeScore;
	
	public GrandFather() {
		System.out.println("GrandFather 생성자 ");
	}
	
	public GrandFather(int score) {
		System.out.println("GrandFather 매개변수 생성자 ");
	}
	
	public void handsome() {
		System.out.println("잘생겼다~");
	}
}
