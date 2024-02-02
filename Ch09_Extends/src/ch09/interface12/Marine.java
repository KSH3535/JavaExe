package ch09.interface12;

/* 어노테이션(Annotation)
 * 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를
   미리 약속된 형식으로 포함시킨 것
 * 주석처럼 영향을 미치지 않으면서도 다른 프로그램에 유용한 정보를 제공
 * ex) @Override, @Deprecated, @SuppressWarnings, @SafeVarargs,
 		 @FunctionalInterface, @Native, @Test
 */

public class Marine implements StarUnit {

	@Override														
	public void walk() {
		System.out.println("아장아장~");
	}

	@Override
	public void attack() {
		System.out.println("두두두두~");
	}

	@Override
	public void die() {
		System.out.println("으악~");
	}

}
