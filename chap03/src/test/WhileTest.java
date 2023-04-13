package test;

public class WhileTest {

	public static void main(String[] args) {
		int i = 2;
        while (i <= 9) {
            System.out.println(i + "단 출력");
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}