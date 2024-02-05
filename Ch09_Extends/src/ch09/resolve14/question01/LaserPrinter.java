package ch09.resolve14.question01;

public class LaserPrinter extends Printer {

	protected double remainTonner;					//토너 잔량
	
	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, 
			int printCnt, int remainPaper, double remainTonner) {
		super(modelName, manufacturer, pInterface, printCnt, remainPaper);
		this.remainTonner = remainTonner;
	}

	@Override
	public void print() {
		super.print();
		this.printCnt++;
		this.remainTonner *= 0.99;
		System.out.println("레이저로 빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [remainTonner=" + remainTonner + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCnt=" + printCnt + ", remainPaper="
				+ remainPaper + "]";
	}

	
	
	

}
