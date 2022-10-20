import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] temp = new int[4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < temp.length; j++) {
				temp[j] = sc.nextInt();
				sum += temp[j];
			}
			if(sum == 0) {
				System.out.println("D");
			}else if(sum == 1) {
				System.out.println("C");
			}else if(sum == 2) {
				System.out.println("B");
			}else if(sum == 3) {
				System.out.println("A");
			}else {
				System.out.println("E");
			}
			sum = 0;
		}
	}

}
