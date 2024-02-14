package ch15.thread01.ch14.sec05.exam03;

public class WorkThread extends Thread {
	//필드
	public boolean work = true;
	//생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	/* 스레드의 제어 권한을 다른 스레드에 넘기는 방법
	 * 1) Thread.sleep(10);
	 *   10ms동안 현재 스레드는 스케줄링에서 제외하겠다
	 *   즉, 다른 스레드에 실행을 넘기겠다.
	 *   난 멈추겠다.
	 * 2) Thread.yield();
	 *   의미없는 일을 하느니 즉시 넘기겠다.
	 *   현재 스레드는 스케줄링에서 제외하겠다
	 *   즉, 다른 스레드에 실행을 넘기겠다.
	 */
	
	//메서드
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();			//cpu의 사용권한(스케쥴링)을 다른 스레드에 넘긴다.
			}
		}
	}
}
