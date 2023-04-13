package test;

import java.util.Scanner;

public class RPS2Test {

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
	}
	
	public static String input(String name) {
		Scanner in = new Scanner(System.in);
		System.out.print(name + ":");
		String ss = in.next();
		return ss;
		
	}
	public static void whosWin(String c, String y) {
		if (c.equals(y)) {
			System.out.println("비겼습니다.");
		} else if ((c.equals("r") && y.equals("s")) ||
				(c.equals("s") && y.equals("p")) ||
				(c.equals("p") && y.equals("r"))) {
			System.out.println("철수 승리!");
		} else {
			System.out.println("영희 승리!");
		}
	}
}

