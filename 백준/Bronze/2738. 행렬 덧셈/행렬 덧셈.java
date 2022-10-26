import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		
		int[][] arr = new int[col][row];
		
		for(int z = 0; z < 2; z++) {
			for(int i = 0; i < col; i++) {
				for(int j = 0; j < row; j++) {
					arr[i][j] += sc.nextInt();
				}
			}
		}
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
