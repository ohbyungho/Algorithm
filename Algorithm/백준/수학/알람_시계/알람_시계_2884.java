package 백준.수학.알람_시계;

import java.util.Scanner;

public class 알람_시계_2884 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int H, M;
		H = num.nextInt();
		M = num.nextInt();
		
		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M-45));
		}
	}
}