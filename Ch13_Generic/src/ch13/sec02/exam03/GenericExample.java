package ch13.sec02.exam03;

public class GenericExample {

	public static void main(String[] args) {
		
		/* Boxx<T>에서 아래처럼 <T>를 지정하지 않으면 자동으로
		 * Object로 결정되서 모든 타입을 받을 수 있다. 
		 */
		
		Box box1 = new Box();
		box1.content = "100";
		
		Box box2 = new Box();
		box2.content = "100";
		
		Box box3 = new Box();
		box3.content = 100;
		
		// Box의 내용물 비교
		boolean result1 = box1.compare(box2);
		System.out.println("reusult1 : " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("result2 : " + result2);
		
		
		
	}

}
