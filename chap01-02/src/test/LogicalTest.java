package test;

import java.util.Scanner;

public class LogicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean tt1, tt2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 정수 입력 : ");
        int num = scanner.nextInt();
        tt1 = (num % 4 == 0) && (num % 5 ==0);
        tt2 = (num % 4 == 0) || (num % 5 ==0);
        
        System.out.println("4와 5로 나누어진다 : " + tt1);
        System.out.println("4 또는 5로 나누어진다 : " + tt2);
        System.out.println("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는다 : " + (tt2 && !tt1));
        
	}

}
