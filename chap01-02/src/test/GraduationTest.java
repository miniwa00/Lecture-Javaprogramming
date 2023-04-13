package test;
import java.util.Scanner;
public class GraduationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("전공 이수 학점 : ");
        System.out.println("교양 이수 학점 : ");
        System.out.println("일반 이수 학점 : ");
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
		boolean b = ((x+y+z)>=140)&&(x>=70)&&((y>=30)&&(z>=30)||(y+z>=80));
        
        System.out.println(b? "졸업 가능" : "졸업 불가");
        
	}

}
