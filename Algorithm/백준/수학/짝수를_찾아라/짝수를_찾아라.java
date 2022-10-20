package 백준.수학.짝수를_찾아라;

import java.util.Scanner;

public class 짝수를_찾아라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt(); // 반복 횟수
		int[] arr = new int[7];
		
		for (int row = 0; row < temp; row++) {
			int min = 100; 
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] % 2 == 0) { // arr[i]번쨰가 짝수라면
					sum += arr[i]; // 짝수값 누적
						if(arr[i] < min) { // arr[i]번쨰가 min 보다 작다면
							min = arr[i]; // 최소값 가져오기
					}
				}
			}
			System.out.println(sum + " "+ min);
		}
	}

}
