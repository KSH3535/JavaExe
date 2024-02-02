package ch09.interface12;

/* 인터페이스 == 추상 클래스
 * 모든 메서드가 추상 메서드
 * 
 * 1) 상속을 전제로 한다
 * 2) 부모의 인터페이스 변수에 자식 객체를 저장
 * 3) 다형성의 의미 (묶어서 관리 easy, 각 변수는 저장된 객체에 따라 각각 개성있게 동작)
 * 4) 클래스와 클래스를 연결
 * 5) 유연할 설계 목적
 * 6) Design Pattern
 * 7) literal constant(상수) => 의미있는 문자열 constant
 * 		상수를 문자열로 사용하고 싶을 때도 인터페이스를 사용하기도 한다.
 * 
 * 인터페이스의 메서드는 public을 붙이지 않아도
 	자동으로 public의 속성을 갖는다.
 */

public interface StarUnit {
	public void walk();
	public void attack();
	public void die();
}

//아래와 같이 써도 동일하나 간결하게 interface로 사용
//public abstract class StarUnit {
//	public void walk();
//	public void attack();
//	public void die();
//}













