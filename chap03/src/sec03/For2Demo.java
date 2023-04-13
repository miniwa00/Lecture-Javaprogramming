package sec03;

public class For2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 2; row < 10; row++) {
			for (int column = 1; column < row; column++) {
			System.out.printf("%4d", row * column);
			}
			System.out.println();
		}
	}

}
