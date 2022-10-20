package 백준.수학.상수;

import java.util.Scanner;
import java.util.stream.Stream;

public class 상수_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp = 0;
		int cnt = 0;

		int[] num3 = Stream.of(String.valueOf(num1).split("")).mapToInt(Integer::parseInt).toArray();
		int[] num4 = Stream.of(String.valueOf(num2).split("")).mapToInt(Integer::parseInt).toArray();
		
		cnt = num3[0];
		num3[0] = num3[2];
		num3[2] = cnt;
		
		temp = num4[0];
		num4[0] = num4[2];
		num4[2] = temp;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(num3[i] + " " +num4[i]);
		}
		
		System.out.println(num3 + " " +num4);
		
	}

}
