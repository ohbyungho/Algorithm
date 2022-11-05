import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] arr = new String[n + m];
		
		for(int i = 0; i < n + m; i++) {
			arr[i] = br.readLine();
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = n; j < n + m; j++) {
				if(arr[i].equals(arr[j])) {
					cnt++;
				}
			}
		}
		
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
