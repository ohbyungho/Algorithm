import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[][] map = new char[101][101];
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		int r = 0;
		int c = 0;
		int r_check = 0;
		int c_check = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				// 가로체크
				if(map[i][j] == '.') {
					r_check++;
				}
				if((j == n-1) || map[i][j] == 'X') {
					if(r_check >= 2) {
						r++;
					}
						r_check = 0;
				}
				// 세로체크
				if(map[j][i] == '.') {
					c_check++;
				}
				if((j == n-1) || map[j][i] == 'X') {
					if(c_check >= 2) {
						c++;
					}
						c_check = 0;
				}
			}
		}
		System.out.println(r + " " + c);
	}

}
