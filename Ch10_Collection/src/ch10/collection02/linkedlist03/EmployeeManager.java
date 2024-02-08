package ch10.collection02.linkedlist03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	
	List<Employee> list = new LinkedList<Employee>(); 
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체 정보 보기");
		System.out.println("5. 정규직 정보 보기");
		System.out.println("6. 임시직 정보 보기");
		System.out.println("7. 일용직 정보 보기");
		System.out.println("8. 검색 및 수정/삭제");
		System.out.println("9. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		
		return sel;
	}
	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = new RegularEmployee (empno, name, yearSalary, bonus);
		
		return emp;
	}
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireyear = sc.nextInt();
		TempEmployee emp = new TempEmployee (empno, name, yearSalary, hireyear);
		
		return emp;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee (empno, name, dailyPay, workDay);
		
		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		return list.add(emp);
	}
	
	private void viewAllEmployeeInfo() {
		for (Employee emp : list) {
			emp.showEmployeeInfo();
		}
	}
	
	private void viewRegularEmployee() {
		for (Employee emp : list) {
			if (emp instanceof RegularEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewTempEmployee() {
		for (Employee emp : list) {
			if (emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployee() {
		for (Employee emp : list) {
			if (emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}
	//=======================================
	
	private void findEmployeeByEmpno(String empno) {
		for (Employee emp : list) {
			if (emp.getEmpno().equals(empno))
				System.err.println(empno);
		}
	}
	
	private void addEmployee(String empno) {
		
	}
	
	private void deleteEmployee(String empno) {
		
	}
	
	private void searchAndUpdateEmployee() {
		
	}
	
	
	
	//=======================================
	
	public void run() {
		boolean isRun = true;

		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				viewAllEmployeeInfo();
				break;
			case EmpMenu.SHOW_REG_INFO:
				viewRegularEmployee();
				break;
			case EmpMenu.SHOW_TEMP_INFO:
				viewTempEmployee();
				break;
			case EmpMenu.SHOW_PART_INFO :
				viewPartTimeEmployee();
				break;
			case EmpMenu.SEARCH_BY_EMPNO:
				searchAndUpdateEmployee();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			//emp 객체가 존재한다면
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		
		System.out.println("Program Exit...");
	}
	
}
