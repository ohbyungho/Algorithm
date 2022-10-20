package 백준.큐.큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<Integer>();
		int last = 0;
		for(int i=0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			String input1 = st.nextToken();
			switch(input1) {
				case "push" :
					int n = Integer.parseInt(st.nextToken());
					que.add(n);					
					last = n;
					break;
				case "pop" :
					if(que.isEmpty()) {
						bw.write(-1+"\n");
					}else {
						bw.write(que.poll()+"\n");
					}
					break;
				case "size" :
					bw.write(que.size()+"\n");
					break;
				case "empty" :
					if(que.isEmpty()) {
						bw.write(1+"\n");
					}else {
						bw.write(0+"\n");
					}
					break;
				case "front" :
					if(que.isEmpty()) {
						bw.write(-1+"\n");
					}else {
						bw.write(que.peek()+"\n");
					}
					break;
				case "back" :
					if(que.isEmpty()) {
						bw.write(-1+"\n");
					}else {
						bw.write(last+"\n");
					}
					break;
			}
		}
			br.close();
	        bw.flush();
	        bw.close();
	}
}
