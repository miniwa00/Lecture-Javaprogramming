package test;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;													// 누적합
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}