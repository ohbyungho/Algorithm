import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		sc.nextLine();
		for(int i = 0; i < temp; i++) {
			int total = 0;
			int cnt = 1;
			char[] ch = sc.nextLine().toCharArray();
			
			for(int j = 0; j < ch.length; j++) {
				if(ch[j] == 'O') {
					total += cnt;
					cnt++;
				}else {
					cnt = 1;
				}
			}
			System.out.println(total);
		}
	}

}
