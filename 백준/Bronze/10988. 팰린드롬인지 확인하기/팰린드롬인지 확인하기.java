import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int check = 1;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c != s.charAt(s.length() - i - 1)) {
				check = 0;
				break;
			}
		}
		System.out.println(check);
	}

}
