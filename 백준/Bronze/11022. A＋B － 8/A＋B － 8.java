import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		
		for(int i = 1; i <= temp; i++) {
			int num = sc.nextInt();
			int num1 = sc.nextInt();
			int total = num + num1;
			System.out.println("Case #" + i +": " + num + " + " + num1 + " = " + total);
		}

	}

}
