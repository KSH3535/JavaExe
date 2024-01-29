package ch06.method01;

public class Resolve3 {
// 	int result = total(10, 100);
//	  위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//	  total 메서드를 작성하고 사용해보세요.
	
	public static int total(int num1, int num2) {
		int result = 0;
		int inputNum1 = num1;
		int inputNum2 = num2;
		
		for (int i =  inputNum1; i <=  inputNum2; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static void viewResult(int result) {
		System.out.println("결과값은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		
		int result = total(10, 100);
		viewResult(result);
	}

}
