import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		char[] c = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'A' :
				c[i] = 'X';
				break;
			case 'B' :
				c[i] = 'Y';
				break;
			case 'C' :
				c[i] = 'Z';
				break;
				default :
					c[i] = (char)(s.charAt(i) - 3);
			}
		}
		
		for(char st : c) {
			bw.write(st + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}