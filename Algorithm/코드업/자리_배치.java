package 코드업;

import java.util.Arrays;
import java.util.Scanner;

public class 자리_배치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 int a[]=new int[num1];
	        for(int i=0; i < num1 ;i++){
	            a[i]=sc.nextInt();
	        }
	        Arrays.sort(a);
	        for(int i = 0; i < num1; i++) {
	        	if( i != 0 && i % num2 == 0) {
	        		System.out.print("\n");
	        	}
	        	System.out.print(a[i] + " ");
	        }
	}

}
