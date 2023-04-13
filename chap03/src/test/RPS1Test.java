package test;

import java.util.Scanner;

public class RPS1Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("철수: ");
		String cheolsu = scanner.next();
		System.out.print("영희: ");
		String yonghee = scanner.next();
		
		if (cheolsu.equals(yonghee)) {
			System.out.println("비겼습니다.");
		} else if ((cheolsu.equals("r") && yonghee.equals("s")) ||
				(cheolsu.equals("s") && yonghee.equals("p")) ||
				(cheolsu.equals("p") && yonghee.equals("r"))) {
			System.out.println("철수 승리!");
		} else {
			System.out.println("영희 승리!");
		}
		scanner.close();
	}
}
