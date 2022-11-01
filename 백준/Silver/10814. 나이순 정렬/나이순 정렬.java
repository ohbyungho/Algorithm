import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine() + " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = String.valueOf(i); // 가입 순서
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0])) {
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
				}else {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
			}
		});
		
		for(String[] str : arr) {
			System.out.println(str[0] + " " + str[1]);
		}
	}

}
