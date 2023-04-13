package sec05;

public class ArithmeticDemo{
	public static void main(String[] args) {
		int remainder = 25 % 2;
		System.out.println("25 / 2의 나머지는 " + remainder + "입니다.");
		int a = 10 % 2;
		
		if (a == 0)
			System.out.println("10은 짝수입니다.");
		else
			System.out.println("10은 홀수입니다.");
	}
}