package 백준.수학.점수계산;

import java.util.Scanner;

public class 점수계산_2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		int[] num = new int[temp];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < temp; i++) {
			if(num[i] == 1) {
				cnt++;
				sum += cnt;
			}else {
				cnt = 0;
			}
		}
		System.out.println(sum);
		
	}
}
