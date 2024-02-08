package ch13.sec03.exam01;

/* T는 입력되는 변수의 DataType을 가리키는 대명사 */

public class Box<T> {
	// 필드
	private T t;

	// Getter
	public T get() {
		return t;
	}

	// Setter
	public void set(T t) {
		this.t = t;
	}
	
	
	
}
