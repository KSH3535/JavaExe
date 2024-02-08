package class01.exam21.abs;

public class PastaReceipt extends Receipt {
	public PastaReceipt(String chef) {
		super(chef);
	}
	
	public void makeSource() {
		System.out.println("파스타 소스는 직접 만듭니다.");
	}
}
