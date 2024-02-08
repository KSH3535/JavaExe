package ch09.extends01;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child  = new Child();
		
		// Child 객체만 생성하였는데 불구하고, Father와 GrandFather의 메서드를 상속받아 사용 가능
		child.handsome();
		child.wealth();
		child.play();
	}
}
