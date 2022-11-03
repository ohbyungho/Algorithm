import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = Integer.parseInt(br.readLine());
		for(int i = 0; i < temp; i++) {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j = 0; j < n; j++) {
			arr[j] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int z = 0; z < m; z++) {
			int num = Integer.parseInt(st.nextToken());
			if(Arrays.binarySearch(arr, num) < 0) {
				sb.append("0" + "\n");
			}else {
				sb.append("1" + "\n");
			}
		}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
