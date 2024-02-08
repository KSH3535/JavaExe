package ch10.collection02.linkedlist03;

//linkedlist02 패키지 아래의 클래스들을
//LinkedList로 변환된 클래스를
//사번으로 검색/수정/삭제 기능을 추가하세요

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
		System.out.println("8. 사번 검색");
		System.out.println("9. 사번 삭제");
		System.out.println("10. 사번 수정");
		System.out.println("11. 종료");
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
	
	//================================================================

	private boolean saveEmployee(Employee newEmp) {
		boolean isSave = false;
		for(int i=0; i<list.size(); i++) {
			Employee emp = list.get(i);
			if(emp.empno.equals(newEmp.empno)) {
				System.out.println(emp.empno + " 사번을 갱신합니다.");
				list.remove(i);
				list.add(i, newEmp);
				isSave = true;
				break;
			}
		}
		
		if(!isSave) {
			System.out.println("새로운 사원을 추가합니다~");
			isSave = list.add(newEmp);
		}
			
		return isSave;
	}
	
	private void viewAllEmployeeInfo() {
		for(int i=0;i<list.size();i++) {
			System.out.println("****** " + (i+1) + " ******");
			Employee emp = list.get(i);
			emp.showEmployeeInfo();
		}
	}
	private void viewRegularEmployee() {
		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			if(emp instanceof RegularEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewTempEmployee() {
		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			if(emp instanceof TempEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewPartTimeEmployee() {
		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			if(emp instanceof PartTimeEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	//================================================================
	
	private String getEmpNo() {
		System.out.print("사번 입력 >> ");
		String empNo = sc.next();
		return empNo;
	}
	private void searchEmployee(String empno) {
		for(int i=0;i<list.size();i++) {			
			Employee emp = list.get(i);
			if(emp.empno.equals(empno)) {
				System.out.println("****** " + (i+1) + " ******");
				emp.showEmployeeInfo();
			}
		}
	}
	private void deleteEmployee(String empno) {
		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			if(emp.empno.equals(empno)) {
				list.remove(i);
				System.out.println("****** " + (i+1) + " ******");
				System.out.println("인덱스 " + i + "를 삭제했습니다.");
			}
		}
	}
	private void modifyEmployee() {
		System.out.println("Main Menu에서 사번과 정보를 입력하시면 새로 갱신됩니다~");
		sc.nextLine();
		sc.nextLine();
	}
	
	
	//================================================================
	
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
			case EmpMenu.EMPNO_SEARCH:
				searchEmployee(getEmpNo());
				break;
			case EmpMenu.EMPNO_DELETE:
				deleteEmployee(getEmpNo());
				break;
			case EmpMenu.EMPNO_MODIFY:
				modifyEmployee();
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
