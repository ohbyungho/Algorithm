package 백준.구현.통계학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 통계학_2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		double avg = 0;
		int temp = Integer.parseInt(br.readLine());
		int length = 0;
		int arr[] = new int[temp];
		int cnt[] = new int[temp];
		for(int i = 0; i < temp; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
			
		for(int i = 0; i < arr.length; i++) {
				bw.write(i + "의 값은? ??" + arr[i] + "\n");
				cnt[i] = arr[i] * 1;
				bw.write(i + "의 값은? " + cnt[i] + "\n");
		}
		bw.write(cnt[1] + " 1은 뭘까요? \n");
		Arrays.sort(arr);
		Arrays.sort(cnt);
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;
		length = arr[arr.length - 1] - arr[0];
		bw.write(Math.round(avg) + "\n"); // 반올림
		bw.write(Math.round(arr[temp / 2]) + "\n"); // 중앙값
		bw.write(cnt[1] + " 최빈값 뭘까? \n");// 최빈값
		bw.write(length + "\n"); // 범위
		
		bw.flush();
		bw.close();
		br.close();
	}

}
