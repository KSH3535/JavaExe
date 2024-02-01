package ch08.class09;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.set(1, 3, 5, 8);
		
		Rectangle rec1 = new Rectangle();
		rec1.set(1, 3, 5, 8);
		
		Rectangle rec2 = new Rectangle();
		rec2.set(50, 20, 30, 70);
		
		rec.show();
		rec1.show();
		rec2.show();
				
		if(rec.equals(rec1)) 
			System.out.println("rec와 rec1은 같은 사각형 입니다.");
		else
			System.out.println("rec와 rec1은 다른 사각형 입니다.");
			
		if(rec.equals(rec2)) 
			System.out.println("rec와 rec2은 같은 사각형 입니다.");
		else
			System.out.println("rec와 rec2은 다른 사각형 입니다.");
	
	}
}
