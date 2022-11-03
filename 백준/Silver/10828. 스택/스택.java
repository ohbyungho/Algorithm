import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int temp = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int last = 0;
		for(int i = 0; i < temp; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String input = st.nextToken();
			
			switch(input) {
			case "push" :
				int n = Integer.parseInt(st.nextToken());
				stack.add(n);
				last = n;
				break;
			case "top" :
				if(stack.empty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(stack.peek() + "\n");
				}
				break;
			case "size" : 
				bw.write(stack.size() + "\n");
				break;
			case "empty" : 
				if(stack.empty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
				break;
			case "pop" :
				if(stack.empty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(stack.pop() + "\n");
				}
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
