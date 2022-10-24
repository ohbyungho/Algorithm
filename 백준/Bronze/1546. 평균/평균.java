import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		double[] num = new double[temp];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextDouble();
		}
		Arrays.sort(num);
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i] / num[num.length - 1] * 100;
		}
		System.out.println(sum / temp);
	}

}
