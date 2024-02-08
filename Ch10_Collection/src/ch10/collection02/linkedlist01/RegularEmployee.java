package ch10.collection02.linkedlist01;

//정규직 사원
public class RegularEmployee extends Employee {
	
	protected int yearSalary;				//연봉
	protected int bonus;						//보너스

	public RegularEmployee(String empno, String name,
											int yearSalary, int bonus) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double) (yearSalary+bonus) / 12;		//월급
		return mPay;
	}

	// 부모의 기능 + 추가 확장	 (Source -> Override/Implement Methods)
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();												// 부모 객체 Employee의 showEmployeeInfo() 호출
		System.out.println("bonus : " + bonus);							// 추가 확장하고자 하는 내용
		System.out.printf("monthPay : %.2f\n ",  getMonthPay());
	}
	
	

}
