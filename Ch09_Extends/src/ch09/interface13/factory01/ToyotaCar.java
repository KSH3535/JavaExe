package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - 始動がスムーズに動作する~T");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("ToyotaCar - エンジンがよく切れる~T");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - アクセルの加速がきく~T");
		Thread.sleep((long)(Math.random() * 500) + 500);	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("ToyotaCar - ブレーキが正確に動作する~T");
		Thread.sleep((long)(Math.random() * 500) + 500);	}

}
