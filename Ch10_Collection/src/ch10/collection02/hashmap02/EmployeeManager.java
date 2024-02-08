package ch10.collection02.hashmap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
	
	private Map<String, Employee> empMap = new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >> ");
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
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
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
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
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
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	
	//=======================================================
	
	private boolean saveEmployee(Employee emp) {

		Employee ret = empMap.put(emp.empno, emp);
		if(ret==null)
			System.out.println("새로 저장합니다.");
		else
			System.out.println("기존의 공간에 덮어씁니다.");
		
		return true;
	}
	private void viewAllEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		int i = 0;
		while(keyIterator.hasNext()) {
			i++;
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			System.out.println("********* " + i + " *********");
			emp.showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		int i = 0;
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof RegularEmployee) {
				System.out.println("********* " + (++i) + " *********");
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewTempEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		int i = 0;
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof TempEmployee) {
				System.out.println("********* " + (++i) + " *********");
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewPartTimeEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		int i = 0;
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof PartTimeEmployee) {
				System.out.println("********* " + (++i) + " *********");
				emp.showEmployeeInfo();				
			}
		}
	}
	
	//=======================================================
	
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
				viewRegEmployeeInfo();
				break;
			case EmpMenu.SHOW_TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.SHOW_PART_INFO:
				viewPartTimeEmployeeInfo();
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
					System.out.println("오류가 발생했습니다.");
			}
		}
		
		System.out.println("Program Exit...");
	}
}
