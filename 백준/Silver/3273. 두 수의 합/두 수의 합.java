import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int temp = Integer.parseInt(st.nextToken());
		int[] arr = new int[temp];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < temp; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int k = Integer.parseInt(br.readLine());
		int cnt = 0;
		int sum = 0;
		int end = temp - 1;
		int start = 0;
		
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
