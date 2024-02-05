package ch09.resolve14.question01;

public class Printer {

	protected String modelName;					//모델명
	protected String manufacturer;				//제조사	
	protected P_INTERFACE pInterface;			//인터페이스 타입
	protected int printCnt;								//인쇄 매수
	protected int remainPaper;						//종이 잔량
	
	// 매개변수 생성자
	public Printer(String modelName, String manufacturer, P_INTERFACE pInterface, int printCnt, int remainPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.pInterface = pInterface;
		this.printCnt = printCnt;
		this.remainPaper = remainPaper;
	}
	
	//
	public void print() {
		this.remainPaper--;
	}
	
	
}
