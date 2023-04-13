package test;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner scanner = new Scanner(System.in);
    System.out.print("등수 입력 : ");
		while((grade = scanner.nextInt()) != 0) {   
			switch(grade) {
			case 1 -> System.out.println("아주 잘했습니다.");
			case 2,3 -> System.out.println("잘했습니다.");
			case 4,5,6 -> System.out.println("보통입니다.");
			default -> System.out.println("노력해야겠습니다.");
			}
			System.out.print("등수 입력 : ");
		}
	}

}
