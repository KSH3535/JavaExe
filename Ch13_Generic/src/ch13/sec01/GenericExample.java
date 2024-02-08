package ch13.sec01;

/* Box<String> box1 = new Box<>();
 * Box<Integer> box2 = new Box<>();
 * 
 * 위 처럼 코드를 작성하면 컴파일러는 자동으로 아래처럼 2개의 클래스를 정의하게 된다.
 * 
 * class Box_String {
 * 		public String content;
 * }
 * class Box_Integer {
 * 		public Integer content;
 * }
 */

public class GenericExample {

	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();							//Box를 생성할 때 타입 파라미터 T 대신 String으로 대체
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box1 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();							//Box를 생성할 때 타입 파라미터 T 대신 Integer으로 대체
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
