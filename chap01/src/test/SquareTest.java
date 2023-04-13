package test;

import java.util.Scanner;

public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = in.nextInt();
		System.out.printf("%d의 제곱은 %d\n",i, i*i);
		System.out.print(i + "의 제곱은 " + i*i);
	}

}
