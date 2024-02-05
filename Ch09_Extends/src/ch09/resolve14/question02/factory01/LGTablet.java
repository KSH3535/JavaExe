package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LGTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LGTablet - 영화 화면이 깨끗하고 선명하다");
		Thread.sleep((long)(Math.random() * 500) + 500);	}								//0.5초~0.999초 사이로 딜레이가 생기게

	@Override
	public void music() throws InterruptedException {
		System.out.println("LGTablet - dolby 사운드가 뛰어나다");
		Thread.sleep((long)(Math.random() * 500) + 500);	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LGTablet - 독서에 최적화되어 있다");
		Thread.sleep((long)(Math.random() * 500) + 500);	}


}
