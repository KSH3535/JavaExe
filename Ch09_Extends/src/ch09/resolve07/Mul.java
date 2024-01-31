package ch09.resolve07;

public class Mul {
	int  a, b;
	
	public Mul() {
		
	}
	
	public Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return (a * b);
	}
}
