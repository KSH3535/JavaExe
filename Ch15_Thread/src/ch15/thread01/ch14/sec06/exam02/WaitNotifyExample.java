package ch15.thread01.ch14.sec06.exam02;

/* 순서를 맞춰주는 동기화 기법
 * 2개의 스레드가 순서대로 1번씩 처리하는 동기화
 */
public class WaitNotifyExample {
	public static void main(String[] args) {
		//공유 작업 객체 생성
		WorkObject workObject = new WorkObject();

		//작업 스레드 생성
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		//작업 스레드 실행
		threadA.start();
		threadB.start();
	}
}