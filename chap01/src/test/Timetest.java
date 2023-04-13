package test;

import java.util.Scanner;

public class Timetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("초 단위 정수를 입력하세요 : ");
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.printf("%d시간 %d분 %d초", hours, minutes, seconds);
    }
}