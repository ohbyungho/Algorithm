import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		
		while(k --> 0) {
			int sum = 0;
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			for(int i = num1-1; i < num3; i++) {
				for(int j = num2-1; j < num4; j++) {
					sum += arr[i][j];
				}
			}
			System.out.println(sum);
		}
	}
	

}
