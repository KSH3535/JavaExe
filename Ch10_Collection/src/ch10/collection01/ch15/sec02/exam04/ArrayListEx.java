package ch10.collection01.ch15.sec02.exam04;

import java.util.ArrayList;
import java.util.List;

/* 자료 구조 (Data Structure)
 * C : Data structure
 * C++ : STL (Template 문법으로 작성)
 * C#/Java : Collection (Generic 문법으로 작성)
 * Python : list, set, tuple, dict
 * 
 * 우리가 만들고자 하는 프로그램의 특성에 맞게 데이터 저장구조를 사용
 */


/* ArrayList는 배열로 구성되어 있다.
 * 다만 배열보다 나은 점은 배열을 꽉 채우면 알아서 내부 공간을 늘려준다.
 * 그리고 <>사이에 어떤 자료형을 넣느냐에 따라 해당 자료형을 저장할 수 있다.
 * 
 * List 인터페이스를 상속 받았고, List 계열 클래스는 List로 변수를 저장해서 사용한다.
 * 
 * List의 가장 큰 특징은 '순서가 보장된다'				
 * ArrayList의 가장 큰 특징은 '내부가 배열로 이루어져 있다'
   다만 배열의 크기를 자동으로 늘려준다.
  (삽입 삭제가 빈번한 경우 사용 지양)
  
 * 위 특성을 고려해보면
 * 데이터 양이 많을 때 삽입과 삭제가 빈번한 경우는 성능의 저하가 일어난다.
 * 데이터 양이 적을 때는 크게 관계 없다. 
 * 
 * 데이터의 양이 많고, 읽기 전용인 경우 그리고 순차 검색인 경우에는 가장 빠른 성능을 가지게 된다.
 */

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("홍길동");
		nameList.add("임꺽정");
		nameList.add("장길산");
		nameList.add("일지매");
		nameList.add("차돌바위");
		
		System.out.println(nameList.size());
		System.out.println(nameList.get(2));
		System.out.println();
		
		//==============================
		
		// 전체 출력
		for (int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i) + " ");
		}
		System.out.println();
		
		// index2에 중간 삽입
		nameList.add(2, "머털이");
		
		// 전체 출력
		for (int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i) + " ");
		}
		System.out.println();
		
		//==============================
		
		// index1 삭제
 		nameList.remove(1);
		
		// forEach 문
		for (String name : nameList) {
			System.out.println(name + " ");
		}
	}

}
