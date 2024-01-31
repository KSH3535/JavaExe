package ch09.extends03;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child  = new Child();
		// Child만 생성해도, 상속받은 클래스들의 모든 생성자 또한 상속됨
		
		// 메서드 상속
		child.handsome();
		child.wealth();
		child.play();
		
		// 필드 상속
		System.out.println("잘생김 점수 : " + child.handSomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println("즐거운 날 : " + child.day);
	}
}
