package 백준.구현.ABC;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_3047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		String arr1 = sc.next();
		for(int i = 0; i < arr.length; i++) {
			if('A' == arr1.charAt(i)) {
				System.out.print(arr[0] + " ");
			}else if('B' == arr1.charAt(i)) {
				System.out.print(arr[1] + " ");
			}else {
				System.out.print(arr[2] + " ");
			}
		}
	}

}
