package ch16.lamda02.ch09.sec07.exam01;

/* 익명(anonymous) 객체
 * 명시적으로 클래스를 선언하지 않아도 객체가 생성되는 경우
 * 클래스를 상속하거나 인터페이스를 구현히야만 생성 가능하다.
 * 1) 익명 자식 객체 (클래스 상속)
 * 2) 익명 구현 객체 (인터페이스 구현)
 */

//익명 자식 객체
public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		//익명 자식 객체가 대입된 필드 사용
		car.run1();
		//익명 자식 객체가 대입된 로컬변수 사용
		car.run2();
		//익명 자식 객체가 대입된 매개변수 사용
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}
}
