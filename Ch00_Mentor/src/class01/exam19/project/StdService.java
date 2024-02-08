package class01.exam19.project;

import java.util.Scanner;

public class StdService {
	private Student[] stdArr;
	
	// 생성자를 통한 객체 배열 초기화
	public StdService() {
		this.stdArr = new Student[3];
	}
	
	// 학생을 생성하는 메서드
	public void createStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====학생을 생성합니다====");
		for(int i=0; i<stdArr.length; i++) {
			System.out.print((i+1) + " 번째 학생 이름 : ");
			String myName = sc.next();
			System.out.print((i+1) + " 번째 학생 국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print((i+1) + " 번째 학생 영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print((i+1) + " 번째 학생 수학 점수 : ");
			int math = sc.nextInt();
			
			// 학생 객체를 생성
			Student st = new Student(myName, kor, eng, math);
			
			// 배열에 저장
			stdArr[i] = st;
		}
		
		System.out.println("====학생 생성을 완료했습니다====");
		
		sc.close();
	}
	
	// 성적 높은순으로 학생정보 출력
	public void printStudent() {
		Student temp = null;
		
		for (int i=stdArr.length; i>0; i--) {
			for (int j=0; j<(i-1); j++) {
//				Student st = stdArr[i];
				if (stdArr[j].getTotal() < stdArr[j+1].getTotal()) {
					temp = stdArr[j+1];
					stdArr[j+1] = stdArr[j];
					stdArr[j] = temp;
				}
			}
		}
		
		// 출력
		for (int i=0; i<stdArr.length; i++) {
			Student st = stdArr[i];
			System.out.print("이름 : " + st.getMyName() + ", ");
			System.out.print("국어 점수 : " + st.getKor() + ", ");
			System.out.print("영어 점수 : " + st.getEng() + ", ");
			System.out.print("수학 점수 : " + st.getMath() + ", ");
			System.out.print("총점 : " + st.getTotal() + ", ");
			System.out.println("평균 : " + st.getAvg());
		}
	}
	
	
	
	
	
	
}
