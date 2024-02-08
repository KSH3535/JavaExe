package ch10.collection01.ch15.sec04.exam01;

/* Map 은 Dictionary. HashTable 구조라고도 한다.
 * 
 * 검색에 최적화되어 있는 구조
 * Set은 값자체를 hash값으로 바꿔서 정렬 후 값을 보관한다.
 * 그러나 Map은 Key값을 hash값으로 바꿔서 정렬 후 값을 보관한다.
 * 그리고 key hash는 테이블로 만들어 실제 value가 위치한 위치값을 저장한다.
 * 그래서 key를 넣으면 value를 빠르게 검색할 수 있다.
 * 아무리 많은 데이터라도 빠르게 검색할 수 있는 자료구조이다.
 * 데이터베이스의 index가 이 자료구조로 되어 있다.
 * 
 * '입력시는  hash값 정렬이 일어나므로 리스트 구조보다 느리다'
 * '다만 특정 값 검색은 가장 빠르다'
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 95);
		map.put("동장군", 80);
		map.put("홍길동", 95);								//키가 같기 때문에 제일 마지막에 저장한 값만 저장
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();

		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);							//키를 매개값으로 주면 값을 리턴
		System.out.println(key + ": " + value);
		System.out.println();

		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();					//키를 반복하기 위해 반복자를 얻음
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ": " + v);
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();			//엔트리를 반복하기 위해 반복자를 얻음
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k +": " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	}
}
