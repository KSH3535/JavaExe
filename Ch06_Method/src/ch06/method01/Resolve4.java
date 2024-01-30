package ch06.method01;

public class Resolve4 {
//	gugudan(3);                                    
//  구구단 메서드를 void 리턴형으로 제작하세요.
//	 3을 입력하면 3단이 출력됩니다.
	
	public static void gugudan(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	public static void main(String[] args) {
		gugudan(3);
	}

}
