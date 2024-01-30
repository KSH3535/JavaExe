package ch08.class01;

public class RestaurantMain {

	public static void main(String[] args) {
		/* 클래스도 자료형!
		 * 우리가 직접 만든 사용자 정의 자료형
		 */
		
		// 클래스 객체 (클래스의 변수)			= new (힙에 할당) 클래스의 생성자 함수 호출;
		// (클래스의 변수를 객체라고 함)
		Restaurant rest = new Restaurant();
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		rest.keyboardEnd();
	}

}
