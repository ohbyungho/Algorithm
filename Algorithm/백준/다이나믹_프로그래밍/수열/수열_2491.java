package 백준.다이나믹_프로그래밍.수열;

import java.util.Scanner;

public class 수열_2491 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		
		int[] num = new int[temp];
		int cnt = 1;
		int cnt1 = 1;
		int result = 1;
		int result1 = 1;
		
		for(int i = 0; i < temp; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < temp - 1; i++) {
			if(num[i] <= num[i + 1]) {
				cnt++;
			}else {
				cnt = 1;
			}if(result < cnt) {
				result = cnt;
			}
			
			if(num[i] >= num[i + 1]) {
				cnt1++;
			}else {
				cnt1 = 1;
			}if(result1 < cnt1) {
				result1 = cnt1;
			}
			
		}
		if(result > result1) {
			System.out.println(result);
		}else {
			System.out.println(result1);
		}
	}

}
