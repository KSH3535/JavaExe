package ch09.resolve14.question02.order01;

import ch09.resolve14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;									//ICar의 상속을 받은 자식 객체들만 저장할 수 있는 변수
	
	// 의존성 주입 
	/* 외부에서 주입 (상속X)
	 * CarTest는 ICar에 의존적이다.
	 */
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	public TabletTester() {
		
	}

	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public int moiveTest() throws InterruptedException {
		for (int i=0; i<TEST_NUM; i++) {
			tablet.movie();
		}
				return (int)(Math.random() * 50) + 50;				//50이상~99이하 랜던값(난수) 리턴 
	}
	
	public int musicTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.music();
		}
		return (int)(Math.random() * 50) + 50;
	}
	public int readBookTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			tablet.readBook();
			
		}
		return (int)(Math.random() * 50) + 50;
	}

}
