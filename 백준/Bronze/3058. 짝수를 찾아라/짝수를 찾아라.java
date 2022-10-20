import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int[] arr = new int[7];
		for (int row = 0; row < temp; row++) {
			int min = 100;
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] % 2 == 0) {
					sum += arr[i];
						if(arr[i] < min) {
							min = arr[i];
					}
				}
			}
			System.out.println(sum + " "+ min);
		}
	}

}
