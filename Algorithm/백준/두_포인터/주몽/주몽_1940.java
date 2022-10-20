package 백준.두_포인터.주몽;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[m];
		int k = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int cnt = 0;
		int start = 0;
		int end = m - 1;
		int sum = 0;
		
		while(start < end) {
			sum = arr[start] + arr[end];
			if(sum == k) {
				cnt++;
			}
			if(sum <= k) {
				start++;
			}else {
				end--;
			}
		}
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
