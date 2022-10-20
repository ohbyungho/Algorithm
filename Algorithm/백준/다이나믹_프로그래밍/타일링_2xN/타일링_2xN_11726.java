package 백준.다이나믹_프로그래밍.타일링_2xN;

import java.util.Scanner;

public class 타일링_2xN_11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
		}
		System.out.println(dp[n]);
	}

}
