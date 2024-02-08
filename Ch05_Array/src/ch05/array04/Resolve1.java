package ch05.array04;

public class Resolve1 {
// String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
	
	public static void main(String[] args) {
//		String[] names = new String[10];
		String[] names = {"aaa", "bbb", "ccc", "ddd", "eee",
									"fff", "ggg", "hhh", "iii", "jjj"};
		

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		
		
		// for each문
		for(String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
