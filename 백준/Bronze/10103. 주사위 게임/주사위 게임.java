import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 100;
		int num1 = 100;
		
		int num4 = sc.nextInt();
		
		for(int i = 0; i < num4; i++) {
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			if(num2 > num3) {
				num1 -= num2;
			}else if(num2 < num3) {
				num -= num3;
			}
		}
		System.out.println(num);
		System.out.println(num1);
	}

}
