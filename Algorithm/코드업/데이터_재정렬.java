package 코드업;

import java.util.Scanner;

public class 데이터_재정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] rank = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < arr.length ; i++){
			   rank[i] = 0;
		}
		  for(int i = 0 ; i < arr.length; i++){
			   for(int j = 0 ; j < arr.length; j++){
			    if(arr[i] > arr[j])
			     rank[i] = rank[i] + 1;
			   }
			  }
		for (int i = 0; i < arr.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}
}
