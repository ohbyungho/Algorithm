import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = n;
		int num1;
		int num2;
		int num3 = 0;
		int cnt = 0;
		while(true) {
			num1 = n / 10;
			num2 = n % 10;
			if(num1 + num2 < 10) {
				num3 = (num2 * 10) + num1 + num2;
			}else {
				num3 = (num2 * 10) + (num1 + num2) % 10;
			}
			cnt++;
			if(a == num3) {
				break;
			}
			n = num3;
		}
		System.out.println(cnt);
		

	}
}