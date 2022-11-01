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
		int k = Integer.parseInt(st.nextToken());
		int cer = Integer.parseInt(st.nextToken());
		int arr[][] = new int[k+1][3];
		int rank = 1;
		for(int i=1; i<=k; i++) {
			st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			arr[index][0] = Integer.parseInt(st.nextToken());
			arr[index][1] = Integer.parseInt(st.nextToken());
			arr[index][2] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= k; i++) {
			if(arr[i][0] > arr[cer][0]) {
				rank++;
			}
			else if(arr[i][0] == arr[cer][0] && arr[i][1] > arr[cer][1]) {
				rank++;
			}
			else if(arr[i][0] == arr[cer][0] && arr[i][1] == arr[cer][1] && arr[i][2] > arr[cer][2]) {
				rank++;
			}
		}
		bw.write(rank + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
