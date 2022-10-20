package 백준.수학.지능형_기차;
import java.util.Scanner;

public class 지능형_기차 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int maxsum = 0;
		for(int i = 1; i < 5; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum1 = sum - num1;
			
			sum = sum1 + num2;
			
			maxsum = Math.max(maxsum, sum);

		}
		System.out.println(maxsum);
	}
}
