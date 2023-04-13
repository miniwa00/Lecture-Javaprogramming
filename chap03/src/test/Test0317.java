package test;

import java.util.Scanner;

public class Test0317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1, t2, t3, t4, t5;
		int even = 0, odd = 0;
		Scanner scanner = new Scanner(System.in);
        System.out.println("5자리 숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        
        t1 = num / 10000;         // 12345 / 10000의 몫
        t2 = num % 10000 / 1000;  // 12345 / 10000의 나머지를 1000으로 나눴을 때의 몫
        t3 = num % 1000 / 100;
        t4 = num % 100 / 10 ;
        t5 = num % 10;	
        
        System.out.println("1의 자리 : " + t5);
        System.out.println("10의 자리 : " + t4);
        System.out.println("100의 자리 : " + t3);
        System.out.println("1000의 자리 : " + t2);
        System.out.println("10000의 자리 : " + t1);
        
        if (t1 % 2 == 0)
        	even++;
        else
        	odd++;
        if (t2 % 2 == 0)
        	even++;
        else
        	odd++;
        if (t3 % 2 == 0)
        	even++;
        else
        	odd++;
        if (t4 % 2 == 0)
        	even++;
        else
        	odd++;
        if (t5 % 2 == 0)
        	even++;
        else
        	odd++;
        System.out.println("짝수의 개수 : " + even);
        System.out.println("홀수의 개수 : " + odd);
        	
	}

}
