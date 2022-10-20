package 백준.구현.X보다작은수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class X보다_작은_수_10871 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int temp = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int arr[] = new int[temp];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < temp; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < temp; i++) {
			if(arr[i] < x) {
				bw.write(arr[i] + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
