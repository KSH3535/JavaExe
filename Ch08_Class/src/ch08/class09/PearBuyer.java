package ch08.class09;

// 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
// 클래스로 설계해서 프로그래밍 하세요
public class PearBuyer {
	private int numOfPear;
	private int money;								// 내가 가진돈
	private int cost;									// 지불한 돈
	final int PEAR_PRICE = 2500;
	
	public PearBuyer(int numOfPear) {
		this.numOfPear = numOfPear;
		this.money = 5000;											// 변동가능성있음 동적으로 변경?
	}
	
	public void buyPear(PearMarket market, int numOfPear) {
		this.numOfPear -= money / PEAR_PRICE;
		this.money -= cost;
	}
	
	public void showBuyResult() {
		System.out.println("*** 나의 배 구매 현황 ***");
		System.out.println("구입한 배 개수 : " + numOfPear);
		System.out.println("현재 잔액 : " + money);						
	}
		
}
