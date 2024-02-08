package ch10.collection02.linkedlist01;

public abstract class Employee {
	//자식객체가 접근가능하도록 필드를 protected로 선언
	protected String empno;					//사번
	protected String name;						//이름
	
	public Employee (String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public void showEmployeeInfo() {
		System.out.println("----------------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	
	public abstract double getMonthPay();				//추상메서드
}
