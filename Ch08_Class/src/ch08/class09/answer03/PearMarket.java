package ch08.class09.answer03;

public class PearMarket {
	private int numOfPear;
	private int saleMoney;
	final int PEAR_PRICE = 2500;
	
	public PearMarket(int numOfPear) {
		this.numOfPear = numOfPear;
	}
	
	public int salePear(int money) {
		int num = money / PEAR_PRICE;
		numOfPear -= num;
		saleMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("*** 마트의 배 재고 현황 ***");
		System.out.println("남은 배 개수 : " + numOfPear);						
		System.out.println("판매 수익 : " + saleMoney);
	}
}
