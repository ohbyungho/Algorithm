import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int temp = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= temp; i++) {
			int x = Integer.parseInt(br.readLine());
			
			int h = (x * 2) / 60;
			int m = (x * 2) % 60;
			
			bw.write("#" + i + " " + h + " " + m + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
