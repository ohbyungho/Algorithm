import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		
		for(int i = 1; i <= temp; i++) {
			int n = sc.nextInt();
			boolean bl = false;
			for(int gu = 1; gu < 10; gu++) {
				for(int dan = 1; dan < 10; dan++) {
					if(n == gu * dan) {
						bl = true;
					}
				}
			}
			if(bl == true) {
				System.out.println("#"+i + " Yes");
			}else {
				System.out.println("#"+i + " No");
			}
		}

	}

}
