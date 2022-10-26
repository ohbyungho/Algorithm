import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[100][100];
		int temp = sc.nextInt();

		for(int i = 0; i < temp; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int row = a; row < a + 10; row++) {
				for(int col = b; col < b + 10; col++) {
					arr[row][col] = 1;
				}
			}
		}
		int cnt = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		

	}

}
