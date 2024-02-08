package ch09.resolve07.answer03;

//다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		  double[] doubleArr = new double[source.length];
		  for (int i=0; i<source.length; i++) {
			  doubleArr[i] = (double) source[i];
		  }
		  return doubleArr;
	}
		
	public static int[] doubleToInt (double[] source) {
		 int[] intArr = new int[source.length];
		 for(int i=0; i<source.length; i++) {
			 intArr[i] = (int) source[i];
		 }
		 return intArr;
	}
}
