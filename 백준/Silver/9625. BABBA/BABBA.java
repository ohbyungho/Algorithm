import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 0; i <= temp; i++) {
			a = b;
			b = c;
			c = a + b;
		
		}
		System.out.println(a + " " + b);
		
	}

}
