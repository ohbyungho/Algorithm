import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int n = 0;
		int a = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > n) {
				n = num[i];
				a = i;
			}
		}
		System.out.println(n);
		System.out.println(a + 1);
	}

}
