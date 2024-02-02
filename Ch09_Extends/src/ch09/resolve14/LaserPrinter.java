package ch09.resolve14;

public class LaserPrinter extends Printer {

	private int remainToner;
	
	public LaserPrinter(String model, String manufacturer, String interfaceType, 
										int printCnt, int remainPaper, int remainToner) {
		super(model, manufacturer, interfaceType, printCnt, remainPaper);
		this.remainToner = remainToner;
	}

	@Override
	public void Print() {
		super.Print();
		System.out.println("토너 잔량 : " + remainToner);
	}
	
	
}
