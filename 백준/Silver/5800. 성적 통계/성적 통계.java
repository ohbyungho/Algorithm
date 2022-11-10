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
		
		int temp = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <= temp; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int z = 0;
			int[] arr = new int[n];
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			for(int j = 0; j < n - 1; j++) {
				z = Math.max(z, arr[j + 1] - arr[j]);
			}
			
			bw.write("Class " + i + "\n");
			bw.write("Max " + arr[arr.length - 1] + ", " + "Min " + arr[0] + ", " + "Largest gap " + z + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
