package 백준.다이나믹_프로그래밍.백준_1로_만들기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_1463_1로_만들기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(x != 1) {
			if(x % 3 == 0) {
				x = x / 3;
				cnt++;
			}
			if(x % 2 == 0 && x != 10) {
				x = x / 2;
				cnt++;
			}else {
				x = x - 1;
				cnt++;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
