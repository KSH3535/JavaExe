package ch09.resolve14;

public class InkjetPrinter extends Printer {

	private int remainInk;
	
	public InkjetPrinter(String model, String manufacturer, String interfaceType, 
										int printCnt, int remainPaper, int remainInk) {
		super(model, manufacturer, interfaceType, printCnt, remainPaper);
		this.remainInk = remainInk;
	}

	@Override
	public void Print() {
		super.Print();
		System.out.println("잉크 잔량 : " + remainInk);
	}
	
	
	
	
}
