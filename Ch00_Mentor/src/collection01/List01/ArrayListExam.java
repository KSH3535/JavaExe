package collection01.List01;

import java.util.ArrayList;
import java.util.List;

/* Generic ?
 * 단순히 자바 컬렉션 프레임워크에 data type을 지정해주기 위한 기술? X
 * 클래스가 다뤄야 할 객체 타입을 외부에서 지정하여 관리할 수 있는 기술! O
 * 제너릭을 이용하여 컬렉션 프레임워크가 저장할 data type을 지정할 수 있다.
 * 기본 data type은 <Object> 
 */

public class ArrayListExam {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		// 추가
		list.add(1);																						// add(V) 		값을 추가
		list.add(2);																						// add(i, V)	해당 인덱스에 값을 추가
		list.add(3);
		list.add(4);
		list.add(5);											// [1, 2, 3, 4, 5]
		System.out.println(list);
		
		// 삽입
		list.add(5, 10);									// [1, 2, 3, 4, 5, 10]				저장되어있지 않은 인덱스를 추가하면 공간 자동 늘림
		list.add(1, 20);									// [1, 20, 2, 3, 4, 5, 10]			1인덱스자리에 삽임하면 원래 있던건 뒤로밀림
		System.out.println(list);
		
		// 치환
		list.set(0,  5);										// [5, 20, 2, 3, 4, 5, 10]
		list.set(4,  13);									// [5, 20, 2, 3, 13, 5, 10]
		System.out.println(list);
		
		// 삭제
		list.remove(4);									// [5, 20, 2, 3, 5, 10]				remove(i) 인덱스를 찾아 해당 값을 삭제
		list.remove(3);
		System.out.println(list);
	
	}
}
