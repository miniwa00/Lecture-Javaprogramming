package sec04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int x = in.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int y = in.nextInt();
		
		System.out.printf("%d과(와) %d의 곱은 %d 입니다 \n",x,y,x*y);
	}

}