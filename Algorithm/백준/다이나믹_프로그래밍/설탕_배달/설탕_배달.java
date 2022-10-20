package 백준.다이나믹_프로그래밍.설탕_배달;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕_배달 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n == 4 || n == 7) {
			bw.write(-1 + "");
		}else if(n % 5 == 0) {
			bw.write(n / 5 + "");
		}else if((n % 5) == 1 || (n % 5) == 3) {
			bw.write((n / 5) + 1 + "");
		}else{
			bw.write((n / 5) + 2 + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
