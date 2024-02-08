package ch10.collection01.ch15.sec05.exam04;

import java.util.TreeSet;

/* 비교 기능이 있는 Comparable 구현 객체를 TreeSet에 저장하거나
 * TreeMap의 키로 저장하는 것이 원칙이지만,
 * 비교 기능이 없는 Comparable  비구현 객체를 저장하고 싶다면
 * TreeSet과 TreeMap을 생성할 때 비교자(Comparator)를 제공하면 된다.
 * 
   TreeSet<E> treeSet = new TreeSet<E>(new Comparator());
   TreeMap<K, V> treeMap = new TreeMap<K, V>(new Comparator());
 */

public class ComparatorExample {
	public static void main(String[] args) {
		
		// 비교자를 제공한 TreeSet 컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		
		// 객체 저장
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		// 객체를 하나씩 가져오기
		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
