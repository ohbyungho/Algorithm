import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<String> list = new ArrayList<String>();
		list.add("O");
		list.add("X");
		list.add("X");
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') { // Collections.swap(list, index1, index2); - index의 위치를 서로 바꿈
				 Collections.swap(list, 0, 1);
			}else if(s.charAt(i) == 'B') {
				Collections.swap(list, 1, 2);
			}else if(s.charAt(i) == 'C') {
				Collections.swap(list, 0, 2);
			}
		}
		bw.write(list.indexOf("O") + 1 + "");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
