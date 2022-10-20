import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int i;
		int sum = 0;
		
		for(i = 1; i < a+1; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
	}
}