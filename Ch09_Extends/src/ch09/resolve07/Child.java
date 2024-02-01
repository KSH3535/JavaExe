package ch09.resolve07;

//다음 클래스를 정의하세요
//1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다
//2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다
//3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다.
//
//main에서는 객체를 이렇게 만듭니다
//  어린이1의 보유자산 -> 구슬 15개
//  어린이2의 보유자산 -> 구슬 9개
//  1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다
//  2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다
//  마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력한다

public class Child {
	int ballCnt;				//보유 구슬 개수
	
	public Child(int ballCnt) {
		this.ballCnt = ballCnt;
	}
	
	public void give(Child other, int cnt) {
		sub(cnt);
		other.add(cnt);
	}
	public void get(Child other, int cnt) {
		add(cnt);
		other.sub(cnt);
	}
	
	/* 클래스 설계에서 접근권한 설정
	 * 필드 -> private
	 * 메서드 -> public
	 * 				   메서드 중에 내부에서만 사용하는 건 private
	 */
	
	private void add(int cnt) {
		this.ballCnt += cnt;
	}
	private void sub(int cnt) {
		this.ballCnt -= cnt;
	}
	
	public int getBallCnt() {
		return ballCnt;
//	public void showBall() {
//		System.out.println("현재 구슬 개수 : " + ballCnt);
	}
}
