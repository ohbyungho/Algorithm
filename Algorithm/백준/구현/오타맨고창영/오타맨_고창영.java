package 백준.구현.오타맨고창영;

import java.util.Scanner;

public class 오타맨_고창영 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		for(int i = 0; i < temp; i++) {
			int num = sc.nextInt();
			String str = sc.next();
			char[] a = str.toCharArray();
			a[num - 1] = ' ';
			str = String.valueOf(a).replaceAll(" " , "");
			System.out.println(str);
		}
	}

}
