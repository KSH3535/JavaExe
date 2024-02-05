package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class SonyTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SonyTablet - コスパがいいね");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SonyTablet - 音楽良好だ");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SonyTablet - 本を読むのに解像度がいい");
		Thread.sleep((long)(Math.random() * 500) + 500);	}

	

}
