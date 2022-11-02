import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int temp = Integer.parseInt(br.readLine());
		
		Integer[][] arr = new Integer[temp][2];
		
		for(int i = 0; i < temp; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0].equals(o2[0])) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(Integer[] i : arr) {
			bw.write(i[1] + " " + i[0] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
