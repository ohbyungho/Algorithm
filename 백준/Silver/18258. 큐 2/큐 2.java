import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int temp = Integer.parseInt(br.readLine());
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		int last = 0;
		for(int i = 0; i < temp; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String input = st.nextToken();
			switch(input) {
			case "push" :
				int n = Integer.parseInt(st.nextToken());
				qu.add(n);
				last = n;
				break;
			case "pop" :
				if(qu.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(qu.poll() + "\n");
				}
				break;
			case "size" :
				bw.write(qu.size() + "\n");
				break;
			case "empty" :
				if(qu.isEmpty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
				break;
			case "front" :
				if(qu.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(qu.peek() + "\n");
				}
				break;
			case "back" :
				if(qu.isEmpty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(last + "\n");
				}
				break;
				
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
