package ch05.array06;

import java.util.Arrays;

// 배열의 얕은 복사 / 깊은 복사
public class ArrayEx {

	public static void main(String[] args) {
		// 얕은 복사
		int[] scores = {100, 88, 95, 67, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		// 복사된 배열들의 항목 출력
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		// 복사된 배열들의 해시코드 출력 -> 모두 같은 위치
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		System.out.println();
		// 얕은 복사는 위치를 공유하기 때문에
		// 한 배열의 항목만 바꿔도 다른 배열도 같이 바뀜
		scores[2] = 99999;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println();
		
		
		
		
		// 깊은 복사
		/* 힙(heap)에 별도의 공간을 생성한 후
		 * scores3는 새로 생성한 공간을 가리키게 된다.
		 * -> 기존 공간과 분리되는 공간이다.
		 */
		int[] scores3 = Arrays.copyOf(scores1, scores1.length);
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores3));
		System.out.println();
		
		scores[2] = 1111111;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(Arrays.toString(scores3));
	}

}
