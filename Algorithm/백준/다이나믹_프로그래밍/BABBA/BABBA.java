package 백준.다이나믹_프로그래밍.BABBA;

import java.util.Scanner;

public class BABBA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 0; i <= temp; i++) {
			a = b;
			b = c;
			c = a + b;
		
		}
		System.out.println(a + " " + b);
	}

}
