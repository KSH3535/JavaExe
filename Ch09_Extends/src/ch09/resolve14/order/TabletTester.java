package ch09.resolve14.order;

import ch09.resolve14.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	
	public TabletTester() {
		
	}
	public TabletTester(ITablet tablet) {
		this.tablet =tablet;
	}
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public int playMovie() throws InterruptedException {
		for (int i=0; i<TEST_NUM; i++) {
			tablet.movie();
		}
		return (int)(Math.random() * 50) + 50;
	}
	public int playMusic() throws InterruptedException {
		for (int i=0; i<TEST_NUM; i++) {
			tablet.music();
		}
		return (int)(Math.random() * 50) + 50;
	}
	public int switchScreen() throws InterruptedException {
		for (int i=0; i<TEST_NUM; i++) {
			tablet.readBook();
		}
		return (int)(Math.random() * 50) + 50;
	}

}
