import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 수열의 크기
		int k = sc.nextInt(); // 몇번 반복
		
		int[] num = new int[n];
		String[] t = new String[n];
		String str = sc.next();
		t = str.split(",");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(t[i]);
		}
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < n - 1; j++) {
				num[j] = num[j + 1] - num[j];
			}
		}
		 for(int i = 0; i < n-k; i++)//반복할수록 K수만큼 줄어들기 때문
	        {
	            System.out.print(num[i]);
	            if(i != n-k-1) {
	            	 System.out.print(',');
	            }
	        }
	}

}
