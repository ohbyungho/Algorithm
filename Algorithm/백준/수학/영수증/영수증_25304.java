package 백준.수학.영수증;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 영수증_25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int sum = 0;
		int total = Integer.parseInt(br.readLine());
		int temp = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < temp; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum += a * b;
		}
		
		if(total == sum) {
			bw.write("Yes" + "");
		}else {
			bw.write("No" + "");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
