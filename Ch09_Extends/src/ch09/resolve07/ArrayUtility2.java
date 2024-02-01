package ch09.resolve07;

//다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

public class ArrayUtility2 {
	public static int[] concat (int[] s1, int[] s2) {
		
		int len = s1.length + s2.length;
		int[] intArr = new int[len];
		int cnt = 0;
		
		for (int i = 0; i < s1.length; i++) {
			intArr[i] = s1[i];
		}
		for (int i = 0; i < s2.length; i++) {
			intArr[cnt] = s2[i];
			cnt++;
		}
		
		return intArr;
	}
	
	public static int[] remove(int[] s1. int[] s2) {
		int[] intArr = new int[s1.length];
		boolean isExist = false;
		int idx = 0;
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j])
					isExist = true;
			}
			if (isExist == false) {
				intArr[idx] = s1[i];
				idx++;
			}
			isExist = false;
		}
	}
	
}
