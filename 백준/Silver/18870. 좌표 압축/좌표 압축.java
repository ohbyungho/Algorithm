import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n]; // 정렬용
		int[] arr2 = new int[n]; // map이랑 비교할 배열
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int rank = 0;
		for(int i : arr) {
			if(!map.containsKey(i)) {
				map.put(i, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i : arr2) {
			sb.append(map.get(i)).append(" ");
		}
		bw.write(sb + " ");
		bw.flush();
		bw.close();
		br.close();
	}

}
