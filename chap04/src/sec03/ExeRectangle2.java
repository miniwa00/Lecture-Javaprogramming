package sec03;

public class ExeRectangle2 {

	public static void main(String[] args) {
		Rectangle2 rec = new Rectangle2();
		System.out.println("사각형의 면적은 : " + rec.calc_area());
	}

}

class Rectangle2 {
	int width = 10;
	int length = 50;
	
	public int calc_area() {
		return width * length;

	}

}