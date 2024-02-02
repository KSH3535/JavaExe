package ch09.interface13.order01;

import ch09.interface13.ICar;

public class CarTester {
	private final int TEST_NUM = 3;
	private ICar car;									//ICar의 상속을 받은 자식 객체들만 저장할 수 있는 변수
	
	// 의존성 주입 (상속X)
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public CarTester(ICar car) {
		this.car = car;
	}
	public CarTester() {
		
	}

	public void setCar(ICar car) {
		this.car = car;
	}
	
	public int onOffTest() throws InterruptedException {
		for (int i=0; i<TEST_NUM; i++) {
			car.turnOn();
			car.turnOff();
		}
		
		return (int)(Math.random() * 50) + 50;				//50이상~99이하 랜던값(난수) 리턴 
	}
	
	public int speedTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			car.accel();
			car.accel();
			car.accel();			
		}
		return (int)(Math.random() * 50) + 50;
	}
	public int footBreakTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			car.accel();
			car.footBreak();
			car.footBreak();
			car.footBreak();
		}
		return (int)(Math.random() * 50) + 50;
	}
	public int driveTest() throws InterruptedException {
		for(int i=0; i<TEST_NUM; i++) {
			car.turnOn();
			car.accel();
			car.accel();
			car.footBreak();
			car.footBreak();
			car.turnOff();
		}
		return (int)(Math.random() * 50) + 50;
	}
}
