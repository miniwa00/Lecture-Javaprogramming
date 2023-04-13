package test;
import java.util.Scanner;
public class DigitSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("0~999 사이의 숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        int a = num % 10;
        int b = num / 10 % 10;
        System.out.println(a + b + ((num-(10*b+a))/100));
	}

}
