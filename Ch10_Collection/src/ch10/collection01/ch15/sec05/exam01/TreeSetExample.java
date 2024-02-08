package ch10.collection01.ch15.sec05.exam01;

/* Tree 구조는 이진트리로 검색에 최적화되어 있는 구조
 * 현재 노드보다 왼쪽에 있는 노드는 반드시 값이 작다.
 * 반대로 현재 노드보다 오른쪽에 있는 노드는 반드시 값이 크다.
 * 내가 원하는 값을 찾을 때까지 계속 노드의 값을 비교하면 왼쪽 or 오른쪽을 따라간다.
 * 
 * '데이터 입력시 정렬과정을 거치게 되므로 List 보다 입력 속도가 느리다'
 * '특정 검색시 Hash 보다는 느리지만 List 보다는 훨씬 빠르다'
 * '노드의 좌측/우측이 명백하게 작으냐 크냐로 구분되므로 비교 검색이 가장 좋은 구조'
 * '정렬이 일어나므로 순서 보장 안된다'
 * 
 * 값 자체를 비교하면 TreeSet
 * Key 값으로 비교하면 TreeMap
 */

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		// TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		// Integer 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 정렬된 Integer 객체를 하나씩 가져오기
		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling(85) + "\n");
		
		// 내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 범위 검색 ( 80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 범위 검색 ( 80 <= score < 90)
		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}

}
