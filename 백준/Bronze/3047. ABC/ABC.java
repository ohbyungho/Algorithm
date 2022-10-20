import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		String arr1 = sc.next();
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if('A' == arr1.charAt(i)) {
				System.out.print(arr[0] + " ");
			}else if('B' == arr1.charAt(i)) {
				System.out.print(arr[1] + " ");
			}else {
				System.out.print(arr[2] + " ");
			}
		}
	}

}
