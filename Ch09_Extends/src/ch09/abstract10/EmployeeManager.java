package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
	
	private final int EMP_NUM = 100;			//최대 사원 수 100명
	private Employee[] empArr = new Employee[EMP_NUM];					//Employee의 자식 객체들을 저장하는 배열
	private int numOfEmp = 0;						//저장된 사원 객체 수
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체 정보 보기");
		System.out.println("5. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	private RegularEmployee createRegularEmployee() {
		System.out.println("사번 >> ");
		String empno = sc.next();
		System.out.println("이름 >> ");
		String name = sc.next();
		System.out.println("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.println("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = new RegularEmployee (empno, name, yearSalary, bonus);
		
		return emp;
	}
	private TempEmployee createTempEmployee() {
		return null;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		return null;
	}
	private boolean saveEmployee(Employee emp) {
		return true;
	}
	private void viewAllEmployeeInfo() {
		
	}
	public void run() {
		boolean isRun = true;
//		while(isRun) {
//			int selNum = viewMenu();
//			switch(selNum) {
//			case 1:
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				isRun = false;
//				break;
//			default:
//				break;
//			}
//		}
		/* 위와 같이 switch문에서 1,2,3,4로 주면 해당숫자가 의미하는게 무엇인지
		 * 찾아봐야함으로 가독성이 떨어짐.
		 * 이럴 때 인터페이스로 만들어놓으면 REG_EMP를 보고 의미 파악이 가능해짐
		 */
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
