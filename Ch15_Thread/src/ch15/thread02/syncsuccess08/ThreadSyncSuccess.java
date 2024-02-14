package ch15.thread02.syncsuccess08;

class Value{
	private int num = 0;
	public int getNum() {
		return num;
	}
	public void Increment() {
		/* 아래 연산이 '스레드의 컨텍스트 스위칭'으로부터 보호되어야 한다.
		 * */
		/*아래 연산이 끝날 때까지 1개의 스레드만 진입해서 동작하도록 한다.
		 * 즉, 연산을 보호한다.
		 * 이 연산이 끝날때까지 Context Switching이 일어나지 않는다.*/
		synchronized(this) {
			num++;
		}		
	}
}

class IncThread extends Thread{
	private Value val;
	public IncThread(Value val) {
		this.val = val;
	}
	@Override
	public void run() {
		for(int i=0;i<100000;i++)
			val.Increment();
	}
}

// 스레드가 1개일 때 값이 정상적인 것을 확인함
public class ThreadSyncSuccess {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		IncThread it3 = new IncThread(val);
		// 스레드를 동시에 진행했을 때 원하는 결과가 나오지 않는다
		it1.start();		
		it2.start();
		it3.start();
		
		try {
			it1.join();	
			it2.join();
			it3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(val.getNum());
	}
}



