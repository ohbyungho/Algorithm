import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		long[] a = new long[69];
		
		a[0] = 1;
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;
		
		for(int i = 4; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2] + a[i - 3] + a[i - 4];
		}
		for(int i = 0; i < temp; i++) {
			int j = sc.nextInt();
			System.out.println(a[j]);
		}
	}

}
