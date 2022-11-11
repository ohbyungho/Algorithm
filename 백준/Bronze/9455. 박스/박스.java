import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		for(int z = 0; z < temp; z++) {
			int cnt = 0;
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] box = new int[m][n];
			
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					box[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m - 1; j++) {
					if(box[j][i] == 1) {
						if(box[j + 1][i] == 0) {
							box[j][i] = 0;
							box[j + 1][i] = 1;
							cnt++;
							j = -1;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

}
