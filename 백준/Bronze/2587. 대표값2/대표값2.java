import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[5];
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		Arrays.sort(arr);
		bw.write(total / arr.length + "\n");
		bw.write(arr[arr.length / 2] + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
