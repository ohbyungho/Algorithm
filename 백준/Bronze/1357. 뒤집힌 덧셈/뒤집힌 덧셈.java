import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		
		sb.append(x).reverse();
		sbb.append(y).reverse();
		
		int sum = Integer.parseInt(sb.toString()) + Integer.parseInt(sbb.toString());
		
		StringBuilder sbr = new StringBuilder();
		sbr.append(sum).reverse();
		bw.write(Integer.parseInt(sbr.toString()) + "");
		
		bw.flush();
		bw.close();
		br.close();

	}

}
