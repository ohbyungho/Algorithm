import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,1,2,2,2,8};
		int[] num = new int[6];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();	
			num[i] = arr[i] - num[i];
			System.out.print(num[i] + " ");
		}
		
	}

}
