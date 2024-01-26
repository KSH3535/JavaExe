package ch05.array04;

public class Resolve4 {
//	int배열을 10개 생성하세요.
//		int배열에 3의 배수를 차례대로 저장하세요.
//		그리고 거꾸로 출력하세요.
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for (int i = 3; i <= nums.length; i+=3) {
			nums[i] = i;
		}
		
		}
	}

}
