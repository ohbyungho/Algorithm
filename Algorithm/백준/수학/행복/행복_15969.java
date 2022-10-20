package 백준.수학.행복;

import java.util.Arrays;
import java.util.Scanner;

public class 행복_15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int[] stu = new int[temp];
		int sub = 0;
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = sc.nextInt();
		}
		Arrays.sort(stu);
		
		sub = stu[temp - 1] - stu[0];
		
		System.out.println(sub);

	}

}
