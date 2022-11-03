import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int temp = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= temp; i++) {
			Stack<Integer> q = new Stack<>();
			int k = Integer.parseInt(br.readLine());
			for(int j = 0; j < k; j++) {
				
				int num = Integer.parseInt(br.readLine());
				if(num == 0) {
					q.pop();
				}else {
					q.add(num);
				}
			}
			if(q.isEmpty()) {
				q.add(0);
			}
			int sum = 0;
			while(!q.isEmpty()) {
				sum += q.pop();
			}
			bw.write("#" + i + " " + sum +" " + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
