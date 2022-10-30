import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람의 수
		int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람의 수
		
		ArrayList<String> list = new ArrayList<>(); // 듣보잡 담을 리스트 생성
		String[] s = new String[n+m]; // 듣도 못한 사람, 보도 못한 사람 담을 배열 생성
		
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine(); // 듣도 못한 사람 배열에 넣음
		}
		
		for (int i = n; i < n+m; i++) {
			s[i] = br.readLine(); // 보도 못한 사람 배열에 넣음
		}
		Arrays.sort(s); // 사전순 정렬
		for (int i = 0; i < n+m-1; i++) {
			if(s[i].equals(s[i+1])) { // 배열 비교중
				list.add(s[i]); // 같으면 리스트에 집어 넣음
			}
		}
		bw.write(list.size() + "\n");
		for(String str : list) {
			bw.write(str + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
