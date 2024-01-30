package ch08.class07;

import java.util.Scanner;

public class Restaurant {
	//필드
//	private String[]  foods = { "냉면", "떡볶이", "쌀국수", "칼국수", "순대", "튀김", "라면" };
	private String[]  foods;
	
	private int selectNum;
//	private Scanner sc = new Scanner(System.in);
	private Scanner sc;
	private String name;
	
	
	
	//생성자 함수(메서드)
	/* 1) 클래스 이름과 동일
	 *  2) return 형이 없다.
	 *  3) 객체 생성되면 자동으로 가장 먼저 호출된다.
	 *  4) 객체의 자동 초기화 작업
	 *  5) 필드변수의 초기화 작업 
	 */
	/* this 는 객체 자신을 의미하며,
	 * 객체 자신의 필드를 가리킬 때 사용한다.
	 */
	public Restaurant(Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
		// this는 생략가능하지만 여기서는 매개변수와 필드명이 동일하기 때문에 사용해야함!
		System.out.println(this.name + " 식당을 청소한다~");
	}
	
	
	
	
	//메서드
	public void viewMenu() {
		System.out.println("-----[ " + this.name + " ]-----");
		for (int i=0; i<foods.length; i++) {
			System.out.println(i + ", " + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("-----[ " + this.name + " ]-----");
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("-----[ " + this.name + " ]-----");
		String food = foods[selectNum];
		System.out.println(food + "이(가) 나왔습니다.");
		System.out.println("맛있게 드세요^^");
		System.out.println();
	}
	public void keyboardEnd() {
		sc.close();
	}
}
