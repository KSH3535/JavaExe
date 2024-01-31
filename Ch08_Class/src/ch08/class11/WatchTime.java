package ch08.class11;

/* 필드는 객체별로 독립적으로 존재
 * 메서드는 처음 객체를 생성할 때, 메모리에 올라감. 
 * 
 * 어떤 객체가 메서드를 호출했는지에 대한 정보가 필요
 * this -> 메서드를 호출한 객체에 대한 레퍼런스 정보가 들어있음
 */

public class WatchTime {
	private int hour, min, sec;
//	private String strHour, strMin, strSec;
//	private boolean isNum = true;
	
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this: " + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
//		this.isNum = true;
	}
	
//	public WatchTime(String strHour, String strMin, String strSec) {
//		System.out.println("this: " + this);
//		this.strHour = strHour;
//		this.strMin = strMin;
//		this.strSec = strSec;
//		this.isNum = false;
//	}
	
	public void viewTime() {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum: " + wtNum);
		System.out.printf("wtNum: %x\n", wtNum.hashCode());
//		wtNum.viewTime();
		
//		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
//		System.out.println("wtStr: " + wtStr);
//		System.out.printf("wtStr: %x\n", wtStr.hashCode());
//		wtStr.viewTime();
		
		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1: " + wtNum1);
		System.out.printf("wtNum1: %x\n", wtNum1.hashCode());
		
	}
}


