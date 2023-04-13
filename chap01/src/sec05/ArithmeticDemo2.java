package sec05;

import java.util.Scanner;

public class ArithmeticDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("원하는 정수 입력 : ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0)
            System.out.println(num + "은(는) 짝수입니다.");
        else 
            System.out.println(num + "은(는) 홀수입니다.");
    }
}

