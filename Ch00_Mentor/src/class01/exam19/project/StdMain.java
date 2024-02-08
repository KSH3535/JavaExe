package class01.exam19.project;

public class StdMain {

	public static void main(String[] args) {
		StdService service = new StdService();
		
		// 학생 생성
		service.createStudent();
		
		// 출력
		service.printStudent();
	}

}
