package ch09.abstract10;

//System.out.println("[ 사원 선택 ]");
//System.out.println("1. 정규직");
//System.out.println("2. 임시직");
//System.out.println("3. 일용직");
//System.out.println("4. 전체 정보 보기");
//System.out.println("5. 종료");

public interface EmpMenu {
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_INFO = 4;
	public int EXIT = 5;
	
	//인터페이스의 값은 자동으로 public으로 생성됨
	//하지만 여기서는 사람이 직관적으로 알아보기 쉽게 public을 붙여주었음

}
