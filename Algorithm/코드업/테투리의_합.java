package 코드업;

import java.util.Scanner;

public class 테투리의_합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int sum = 0;
		int num = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
				sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
