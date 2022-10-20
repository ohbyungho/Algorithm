import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder("<");
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q1 = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= n; i++) { // 큐에 n까지의 수 차례로 넣어주기
			q.add(i);
		}
		
		while(!q.isEmpty()) { // 큐가 빌 때까지 반복, 즉 n명의 사람이 모두 제거될 떄까지
			for(int i = 0; i < k; i++) { // k번째를 제거하기 위한 루프
				if(i == k - 1) {
					sb.append(q.poll() + ", "); // k번을 제거
				} else {
					q.add(q.poll()); // K번이 아닐 때에는 맨 뒤로 이동
				}				
			}
		}
		
		bw.write((sb.substring(0, sb.length() - 2) + ">").toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
