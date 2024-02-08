package ch12.object01.ch12.sec03.exam01;

// Java의 모든 클래스의 최상위 부모는 Object 클래스가 된다.
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 1) obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
		if (obj instanceof Member target) {
			// 2) id 문자열이 같은지 비교
			if (id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
}
