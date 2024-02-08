package ch05.array08;

import java.util.Arrays;

public class Resolve1 {
// 정수 배열 5개를 할당하고
//	   Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
	
	public static void main(String[] args) {
		int[] nums = {10, 93, 23, 7, 61};
		
		System.out.println(Arrays.toString(nums));
		
		// 오름차순 정렬
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println("최소값 : " + nums[0]);
		System.out.println("최대값 : " + nums[nums.length-1]);
	}

}
