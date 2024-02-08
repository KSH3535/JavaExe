package ch08.class09.answer03;

// 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
// 클래스로 설계해서 프로그래밍 하세요
public class PearBuyer {
	private int numOfPear;
	private int money;								// 내가 가진돈
	final int PEAR_PRICE = 2500;
	
	public PearBuyer(int money) {
		this.money = money;											
		this.numOfPear = 0;
	}
	
	public void buyPear(PearMarket market, int money) {
		this.numOfPear += market.salePear(money);
		this.money -= money;
	}
	
	public void showBuyResult() {
		System.out.println("*** 나의 배 구매 현황 ***");
		System.out.println("배 개수 : " + numOfPear);
		System.out.println("현재 잔액 : " + money);						
	}
		
}
