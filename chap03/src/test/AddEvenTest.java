package test;

import java.util.Scanner;

public class AddEvenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("양의 정수를 입력하세요!");
                break;
            }
            if (num % 2 == 0) {
                sum += num;
            }
        } while (num != 0);
        System.out.println("입력된 짝수의 합은 " + sum + "입니다.");
    }
}
