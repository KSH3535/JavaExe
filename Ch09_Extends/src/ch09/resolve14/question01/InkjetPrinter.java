package ch09.resolve14.question01;

public class InkjetPrinter extends Printer {
	
	protected double remainInk;					//잉크 잔량

	public InkjetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, 
			int printCnt, int remainPaper, double remainInk) {
		super(modelName, manufacturer, pInterface, printCnt, remainPaper);
		this.remainInk = remainInk;
	}

	@Override
	public void print() {
		super.print();										//종이 1장 사용
		this.printCnt++;								//인쇄 횟수 증가
		this.remainInk -= 0.1;						//잉크 0.1 사용
		System.out.println("잉크가 잘 분사되어 출력된다.");
		System.out.println("품질이 양호하다.");
		
	}

	// Source -> Generate toSring()
	@Override
	public String toString() {
		return "InkjetPrinter [remainInk=" + remainInk + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", pInterface=" + pInterface + ", printCnt=" + printCnt + ", remainPaper=" + remainPaper + "]";
	}

	
	
	
	
	

}
