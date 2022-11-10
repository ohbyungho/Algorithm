import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			int[] arr = new int[4];
			
			for(int i = 0; i < input.length(); i++) {
				// 소문자
				if(input.charAt(i) >= 97 && input.charAt(i) <= 122) {
					arr[0] += 1;
				}
				// 대문자
				if(input.charAt(i) >= 65 && input.charAt(i) <= 90) {
					arr[1] += 1;
				}
				// 숫자
				if(input.charAt(i) >= 48 && input.charAt(i) <= 57) {
					arr[2] += 1;
				}
				// 공백
				if(input.charAt(i) == 32) {
					arr[3] += 1;
				}
			}
			for(int i : arr) {
				bw.write(i + " ");
			}
			bw.write("\n");
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
