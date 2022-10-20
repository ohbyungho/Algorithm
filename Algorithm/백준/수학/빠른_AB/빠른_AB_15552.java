package 백준.수학.빠른_AB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른_AB_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < temp; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			bw.write(o+t+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
