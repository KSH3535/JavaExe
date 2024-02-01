package ch09.hasa08;

public class Gun {
	private int bullet;								//총알
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shot() {							//총을 쏘는 메서드
		if (bullet > 0) {
			System.out.println("BBANG!");
			bullet--;
		} else {
			System.out.println("Chulkuk...");
		}
	}
	
	
	
	
	
}
