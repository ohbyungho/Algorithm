import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 점화식
		// 1를 뺄 때는 d[i] = d[i-1] + 1
		// 2로 나눌 수 있을 때는 d[i] = d[i/2] + 1
		// 3으로 나눌 수 있을 때는 d[i] = d[i/3] + 1
		
		int x = Integer.parseInt(br.readLine());
		
		int[] dp = new int[x+1];

		dp[1] = 0; // 초기값 설정
		for (int i = 2; i < x+1; i++)
		{
			dp[i] = dp[i-1]+1;
			if (i % 2 == 0 && dp[i] > dp[i/2]+1)
			{
				dp[i] = dp[i/2]+1;
			}
			if (i % 3 == 0 && dp[i] > dp[i/3]+1)
			{
				dp[i] = dp[i/3]+1;
			}
		}
		bw.write(dp[x] + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
