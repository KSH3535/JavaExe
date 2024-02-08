package ch03.for10;

public class Resolve6 {
//	do~while문을 이용해서 1부터 10까지 합을 출력하세요
	
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		do {
			sum+=i;
			i++;
		} while (i <= 10);
		
		System.out.println(sum);
	}

}
