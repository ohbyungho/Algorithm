import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] map = new char[n + 1][m + 1];
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		int cnt = 0;
		int cnt1 = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= m - 1; j++) {
				if(map[i][j] == '-') {
					if(map[i][j + 1] == '|' || j == m - 1) {
						cnt++;
					}
				}
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j <= n - 1; j++) {
				if(map[j][i] == '|') {
					if(map[j + 1][i] == '-' || j == n - 1) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
