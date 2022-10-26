import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int sum = 0;
		int sum1 = 0;
		for(int i = arr.length - 1; i >= arr.length - 3; i--) {
			sum += arr[i];
			sum1 += arr1[i];
		}
		System.out.println(sum + " " + sum1);
	}

}
