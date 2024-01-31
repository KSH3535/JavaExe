package ch08.class10;

/* 메서드(함수) 오버로딩(Overloading)
 * 		: 자바는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 		 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에
 */

public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;
	
	public WatchTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}
	
	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNum = false;
	}
	
	public void viewTime() {
		if(isNum)
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		else
			System.err.printf("- %s %s %s -\n", strHour, strMin, strSec);
	}
	
	
	// main 메서드는 클래스에 종속적이지는 않으나, 반드시 클래스 안에 존재하긴 해야함
	public static void main(String[] args) {
		// 그렇기 때문에 객체를 생성해야 호출 가능
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();
		
		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
		wtStr.viewTime();
	}
}


