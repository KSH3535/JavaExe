package class01.exam19.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String myName;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String myName, int kor, int eng, int math) {
		this.myName = myName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// 총점 구하는 메서드
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	
	// 평균 구하는 메서드
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		BigDecimal dec = new BigDecimal(avg);
		return dec.setScale(2, RoundingMode.HALF_UP).doubleValue();
								     // (소수점 둘째자리, 반올림).double로 반환
	}
	
	/* BigDecimal 클래스
	 	소수점 처리가 가능한 클래스
	 * .setScale(자릿수, 옵션)
	   이때 옵션은 반올림, 내림, 올림 등
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
