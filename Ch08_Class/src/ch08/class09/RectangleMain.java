package ch08.class09;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.set(1, 3, 5, 8);
		rec.show();
		
		
		Rectangle rec1 = new Rectangle();
		rec1.set(1, 3, 1, 8);
		if(rec.equals(rec1)) {
			System.out.println("두 좌표로 사각형의 넓이를 구할 수 없습니다.");
		} else {
			rec1.show();
		}
		
		
		Rectangle rec2 = new Rectangle();
		rec2.set(1, 3, 5, 8);
		if(rec.equals(rec2)) {
			
		} else {
			rec2.show();
		}
	}
}
