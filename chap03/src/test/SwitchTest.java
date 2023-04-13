package test;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score;
        do {
            System.out.print("성적을 입력하세요: ");
            score = in.nextInt();

            if (score < 0) {
                break;
            }

            String grade;
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                case 7:
                    grade = "B";
                    break;
                case 6:
                case 5:
                    grade = "C";
                    break;
                case 4:
                    grade = "D";
                    break;
                default:
                    grade = "F";
                    break;
            }

            System.out.println("당신의 성적 등급은 " + grade + "입니다.");

        } while (true);

        System.out.println("프로그램을 종료합니다.");
    }
}