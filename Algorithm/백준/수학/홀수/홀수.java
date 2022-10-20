package 백준.수학.홀수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 홀수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int[] num = new int[7];
		int sum = 0;
		int min = 1000;
		for(int i = 0; i < num.length; i++) {
			st = new StringTokenizer(br.readLine());
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i] % 2 == 1) {
				sum += num[i];
				min = Math.min(min, num[i]);
			}
		}
		
			if(sum != 0) {
				bw.write(sum + "\n");
				bw.write(min + "\n");
			}
		else {
			bw.write(-1 + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
