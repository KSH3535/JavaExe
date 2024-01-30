package ch08.class06;

/* 클래스로 묶은 변수를 쉽게 접근 허용하는 것은
 * 프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
 * 경험적으로 알게 되었다.
 * 
 *  그래서 클래스 내부에서만 사용한다는 개념(private)과
 *  밖에서도 접근한다는 개념(public)이 등장하게 되었다.
 *  
 *  [객체지향의 기본 원칙]
 *  필드 변수 : private 으로 하는 관습이 있다.	(외부 직접 접근 불허)
 *  메서드 : public 으로 하는 관습이 있다. 		(외부 사용을 전제로)
 */

public class Human {
//	public String name;
//	public int age;
//	public double score;
	private String name;
	private int age;
	private double score;
	
	
	// Setter		(public으로 생성)
	public void setName(String _name) {
		name = _name;
	}
	public void setAge(int _age) {
		if (_age < 0)
			return;									// void 함수에서 return은 반환값이 아닌, 아래를 실행하지 않고 위로 돌아가라
		age = _age;
	}
	public void setScore(double _score) {
		if (_score < 0)
			return;
		score = _score;
	}
	
	
	// Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getScore() {
		return score;
	}
}
