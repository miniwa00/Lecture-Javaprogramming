package test;

import java.util.Scanner;

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		        
		System.out.print("원기둥의 밑면의 반지름은? ");
		double radius = scanner.nextDouble();
		        	
		System.out.print("원기둥의 높이는? ");
		double height = scanner.nextDouble();
		        
		double volume = 3.14 * radius * radius * height;	        
		System.out.println("원기둥의 부피는 " + volume);

	}

}
