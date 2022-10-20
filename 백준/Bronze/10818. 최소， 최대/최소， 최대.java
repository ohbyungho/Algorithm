import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int[] num = new int[temp];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[temp-1]);

	}

}
