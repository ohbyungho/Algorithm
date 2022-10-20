package 코드업;

import java.util.Scanner;

public class 바둑판에_흰_돌_놓기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[19][19];
		int temp = sc.nextInt();
		for(int i = 0; i < temp; i++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			arr[row-1][col-1] = 1;
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
