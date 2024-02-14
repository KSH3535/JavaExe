package ch16.lamda03.funcInter03;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}


public class TestLamda {
	public static void main(String[] args) {
		PrintString reStr = returnString();
		reStr.showString("hello ");
	}
	
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
