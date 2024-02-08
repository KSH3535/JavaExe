package ch10.collection01.ch15.sec06.exam01;

/* Stack
 *  1, 2, 3 넣으면 3, 2, 1 출력
 * LIFO 최근 항목에 우선순위를 둘 때 사용 (시간 역순)
 *  알고리즘도 이런 구조
 */


import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		// Stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 동전을 하나씩 꺼내기
		while (!coinBox.isEmpty()) {					//비어있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}

}
