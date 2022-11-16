import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(set.contains(num)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
    }
}
