import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total = a*b*c;
		
		int[] cnt = new int[10];
		
		while(total != 0) {
			cnt[total % 10]++;
			
			total /= 10;
		}
		for(int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		
	}

}
