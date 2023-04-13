package test;
import java.util.Scanner;
public class Gutest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("출력하고자 하는 구구단 : ");
        int dan = scanner.nextInt();     	
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
			i++;
		}
	}

}
