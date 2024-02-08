package ch05.array04;

public class Resolve2 {
// String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
	
	public static void main(String[] args) {
		String[] names = {"aaa", "bbb", "ccc", "ddd", "eee",
									"fff", "ggg", "hhh", "iii", "jjj"};
		
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i] + " ");
		}
	}

}
