package test;

public class PiramidTest {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {         // 줄 수를 나타냠
		    for(int j = 1; j <= i; j++) {     // 각 줄마다 추력할 별의 개수
		        System.out.print("*");		   // 별표 출력
		    }
		    System.out.println();   		   // 한 줄 띄어쓰기
		}
	}
}