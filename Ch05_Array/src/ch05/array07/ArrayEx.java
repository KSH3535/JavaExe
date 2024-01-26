package ch05.array07;

import java.util.Arrays;

// 배열의 얕은 복사 / 깊은 복사
public class ArrayEx {

	public static void main(String[] args) {
		
		// 배열의 정렬 (오름차순)
		/* 
		 * Arrays.sort(scores);					데이터가 적을 때
		 * Arrays.parallelSort(scores);			데이터가 많을 때
		 */
		int[] scores = { 98, 12, 52, 93, 33, 54, 21 };
		System.out.println(Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));

		
	}

}
