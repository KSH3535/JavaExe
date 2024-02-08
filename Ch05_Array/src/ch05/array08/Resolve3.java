package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
// 정수 배열 5개를 할당하고,
// System.out.println(Arrays.toString(numArr)); 로 출력했을 때
// 거꾸로 배열의 값이 출력되도록
// 배열의 값을 거꾸로 저장하세요.
	
	public static void main(String[] args) {
		int[] numArr = {10, 99, 73, 62, 5};
		int temp = 0;
//		int temp1 = 0;
		
		System.out.println(Arrays.toString(numArr));
		
//		temp = numArr[0];
//		numArr[0] = numArr[numArr.length-1];
//		numArr[numArr.length-1] = temp;
//		
//		temp1 = numArr[1];
//		numArr[1] = numArr[numArr.length-2];
//		numArr[numArr.length-2] = temp1;
		
		for (int i = 0; i < numArr.length/2; i++) {
			temp = numArr[i];
			numArr[i] = numArr[numArr.length-(i+1)];
			numArr[numArr.length-(i+1)] = temp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}

}
