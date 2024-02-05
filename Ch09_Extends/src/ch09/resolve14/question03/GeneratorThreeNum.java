package ch09.resolve14.question03;

// 난수 3개를 생성하는 역할
public class GeneratorThreeNum {
	
	//객체 필드가 굳이 필요없는 클래스 이기에 바로 호출해서 사용하기 위해
	//객체를 만들지 않고 static 메서드로 만듬
	public static int[] getRandomNum() {
		int[] numArr = new int[3];
		
		// 1번째 난수 생성
		numArr[0] = (int) (Math.random() * 10);			//0 ~ 9 사이의 난수 생성
		
		// 2번째 난수 생성
		boolean isRun = true;
		while(isRun) {
			int rNum = (int) (Math.random() * 10);
			//1번째 값과 같으면 다시 반복해서 다시 생성하라
			if(rNum == numArr[0])
				continue;
			
			numArr[1] = rNum;
			 isRun = false;
		}
		
		// 3번째 난수 생성
		isRun = true;
		while(isRun) {
			int rNum = (int) (Math.random() * 10);
			//1번째 값 또는 2번째 값이 같으면 다시 반복해서 다시 생성하라
			if(rNum == numArr[0] || rNum == numArr[1])
				continue;
			
			numArr[2] = rNum;
			 isRun = false;
		}
		
		return numArr;
	}
	
}


/* 1. isRun 안쓰고 while(true) break; 쓰면 안되나?
 * 2. else 생략?
 */
