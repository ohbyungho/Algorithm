import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		int[] arr = new int[temp];
		int cnt = 0;
		for(int i = 0; i < temp; i++) {
			arr[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
