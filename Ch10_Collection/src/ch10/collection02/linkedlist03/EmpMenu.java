package ch10.collection02.linkedlist03;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체 정보 보기");
//System.out.println("5. 정규직 정보 보기");
//System.out.println("6. 임시직 정보 보기");
//System.out.println("7. 일용직 정보 보기");
//System.out.println("8. 종료");

public interface EmpMenu {
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_INFO = 4;
	public int SHOW_REG_INFO = 5;
	public int SHOW_TEMP_INFO = 6;
	public int SHOW_PART_INFO = 7;
	public int EMPNO_SEARCH = 8;
	public int EMPNO_DELETE = 9;
	public int EMPNO_MODIFY = 10;
	public int EXIT = 11;
	
	//인터페이스의 값은 자동으로 public으로 생성됨
	//하지만 여기서는 사람이 직관적으로 알아보기 쉽게 public을 붙여주었음

}
