import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String st = br.readLine();
		
		for(int i = 0; i < s.length; i++) {
			if(st.contains(s[i])) { // contains - st 문자열에 s[i] 문자가 있는지 확인
				st = st.replace(s[i], "!"); // 있으면 s[i] 문자를 느낌표로 바꾼다 카운트 1개 증가 시키기 위해
			}
		}
		bw.write(st.length() + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
