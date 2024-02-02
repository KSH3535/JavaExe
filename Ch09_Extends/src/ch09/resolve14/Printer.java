package ch09.resolve14;

public class Printer {
	private final int PAPER = 100;
	private String model;
	private String manufacturer;
	private String interfaceType;
	private int printCnt = 0;
	private int remainPaper = PAPER;
	
	public Printer (String model, String manufacturer, String interfaceType, 
								int printCnt, int remainPaper) {
		
	}
	
	public void Print() {
		for (int i=0; i<PAPER; i++) {
			System.out.println("모델명 : " + this.model);
			System.out.println("제조사 : " + this.manufacturer);
			System.out.println("인터페이스 종류 : " + this.interfaceType);
			System.out.println("인쇄 매수 : " +this.interfaceType);
			System.out.println("남은 종이 : " + this.interfaceType);
		
			printCnt++;
			remainPaper--;
		}
	}
}
