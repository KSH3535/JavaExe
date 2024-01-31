package ch09.isKindOf06;

public class Police extends Gun {
	private int handCuffs;								//수갑
	
	public Police(int bullet, int handCuffs) {
		super(bullet);
		this.handCuffs = handCuffs;
	}
	
	public void putHandCuffs() {						//수갑을 채우는 메서드
		if (handCuffs > 0) {
			System.out.println("SNAP!");
			handCuffs--;
		} else {
			System.out.println("Miss...");
		}
	}
	
	
	
}
