package test;

public class PytagorasTest {

		public static void main(String[] args) {
			for(int a = 1; a <= 20; a++) {
				for(int b = 1; b <= 20; b++) {
					for(int c = 1; c <= 20; c++) {
						if (c*c == a*a+b*b) {
							System.out.println(a + ", " + b + ", " + c);
					}
				}
			}
		}
	}
}
