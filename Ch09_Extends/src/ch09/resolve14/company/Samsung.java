package ch09.resolve14.company;

import ch09.resolve14.ITablet;

public class Samsung implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Samsung > 1080p 고화질 영화 재생");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Samsung > Dolby 사운드 음악 감상");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Samsung > 부드러운 화면 전환 책 읽기");
		Thread.sleep((long)(Math.random() * 500) + 500);
	}

}
