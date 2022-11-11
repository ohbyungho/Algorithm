import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int cnt = 0;
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				if(s.charAt(j) == '.' && cnt == 0) {
					System.out.print(-1 + " ");
				}else if(s.charAt(j) == 'c') {
					System.out.print(0 + " ");
					cnt = 1;
				}else if(s.charAt(j) == '.' && cnt != 0) {
					System.out.print(cnt + " ");
					cnt++;
				}
			}
			System.out.println();
			cnt = 0;
		}
	}

}
