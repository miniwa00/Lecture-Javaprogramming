package test;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num, sum;
		while(true) {
			System.out.print("양의 정수를 입력하세요 : ");
			num = scanner.nextInt();
			sum = 0;
	        for (int i = 1; i <= num; i++) {
	            sum += i;
	        }
			if (num==999)
				break;
			System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
}