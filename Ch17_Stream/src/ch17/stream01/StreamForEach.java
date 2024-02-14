package ch17.stream01;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
		int[] arr = {10, 30, 99, 2, 77, 3};
		
		//1번째)출력하는 방법 
		System.out.println(Arrays.toString(arr));
		
		//2번째)출력하는 방법 
		for (int i=0; i<arr.length; i++) 
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		//3번째)출력하는 방법 
		for (int e : arr)
			System.out.print(e + ", ");
		System.out.println();
		
		//4번째)스트림 사용	(스트림객체 -> 최종연산)
		Arrays.stream(arr).forEach(n -> System.out.print(n + ", "));
		
		
	}
}
