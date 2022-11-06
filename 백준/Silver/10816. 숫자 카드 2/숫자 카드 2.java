import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringBuilder sb = new StringBuilder();
	      StringTokenizer st;
	 
	      int n = Integer.parseInt(br.readLine());
	      Map<Integer,Integer> map = new HashMap<>();
	 
	      st = new StringTokenizer(br.readLine()," ");
	      for(int i=0;i<n;i++) {
	         int num = Integer.parseInt(st.nextToken());
	         Integer cnt = map.get(num);
	         if(cnt != null) {
	            map.put(num, cnt+1);
	         } else {
	            map.put(num, 1);
	         }
	      }
	 
	      int m = Integer.parseInt(br.readLine());
	 
	      st = new StringTokenizer(br.readLine()," ");
	      for(int i=0;i<m;i++) {
	         int num = Integer.parseInt(st.nextToken());
	         Integer cnt = map.get(num);
	         if(cnt != null) {
	        	 sb.append(cnt+" ");
	         }
	         else {
	        	 sb.append("0 ");
	         }
	      }
	 
	      System.out.println(sb);

	}

}
