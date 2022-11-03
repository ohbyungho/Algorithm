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
		int cnt = 0;
		int k = Integer.parseInt(st.nextToken());
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(cnt == k) {
					bw.write(i + " " + j);
				}
				cnt++;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
