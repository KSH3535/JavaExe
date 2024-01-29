package ch05.array08;

public class Resolve2 {
// 정수 배열 5개를 할당하고
//	   Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요

	public static void main(String[] args) {
		int[] nums = {10, 93, 23, 7, 61};
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		
		
		// 삼항연산자로 못푸나?
		for (int i = 0; i < nums.length; i++) {
			max = nums[i] > max ? nums[i] : max;
			min = nums[i] < min ? nums[i] : min;
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		
		
		// Math.max, Math.min 함수 사용
		int max2 = nums[0];
		int min2 = nums[0];
		
		for (int i : nums) {
			max2 = Math.max(i, max2);
			min2 = Math.min(i, min2);
		}
		System.out.println("최소값 : " + min2);
		System.out.println("최대값 : " + max2);
		
	}

}
