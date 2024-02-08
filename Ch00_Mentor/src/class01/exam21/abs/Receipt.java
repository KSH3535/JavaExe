package class01.exam21.abs;

public abstract class Receipt {
	private String chef;
	
	public Receipt(String chef) {
		this.chef = chef;
	}
	
	public void info() {
		System.out.println("이 레시피는 " + this.chef + " 의 것입니다.");
	}
}
