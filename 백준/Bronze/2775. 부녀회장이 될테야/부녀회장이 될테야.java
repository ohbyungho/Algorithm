import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = new int[15][15]; // 14F 14호 배열
		
		for(int i = 0; i < 15; i++) {
			apt[0][i] = i; // 0F의 호수(i)들은 i다.
			apt[i][1] = 1; // 각 층의 1호는 1이다.
		}
		for(int i = 1; i < 15; i++) { // 1층 부터 14층 까지
			for(int j = 2; j < 15; j++) { // 2호부터 14호 까지
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j]; // apt[5][5] = apt[5][4] + apt[4][5] 
			}
		}
		int temp = sc.nextInt();
		for(int i = 0; i < temp; i++) {
			int F = sc.nextInt();
			int H = sc.nextInt();
			System.out.println(apt[F][H]);
		}
	}

}
