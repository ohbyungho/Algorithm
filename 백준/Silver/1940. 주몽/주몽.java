import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int temp = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[temp];
		
		String str = br.readLine();
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < temp; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);
		int cnt = 0;
		int start = 0;
		int end = temp - 1;
		int sum = 0;
		
		while(start < end) {
			sum = arr[start] + arr[end];
			if(sum == m) {
				cnt++;
			}
			if(sum <= m) {
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
