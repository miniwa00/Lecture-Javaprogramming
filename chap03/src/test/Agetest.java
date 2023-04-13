package test;
import java.util.Scanner;
public class Agetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if (num > 19)
        	System.out.println("성년");
        else
        	System.out.println("미성년");
	}

}
