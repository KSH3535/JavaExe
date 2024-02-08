package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
// 정수 배열 5개를 할당하고
// Arrarys.sort를 사용하지 않고
// 배열을 오름차순으로 정렬하도록 저장한 뒤 출력하세요

	public static void main(String[] args) {
		int[] numArr = {10, 99, 73, 62, 5};
		
		int temp = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i+1; j < numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(numArr));
	}

}
