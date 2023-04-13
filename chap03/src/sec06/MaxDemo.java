package sec06;

import java.util.Scanner;

public class MaxDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = in.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("두 수 중에 큰 수는 %d입니다.\n", get_max(x,y));
	}

	public static int get_max(int x, int y) {
		if (x > y) return x;
		else return y;
	}
}