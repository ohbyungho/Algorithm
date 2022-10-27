import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int height = 10;
		
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) {
				height += 5;
			}else {
				height += 10;
			}
		}
		System.out.println(height);
	}

}
