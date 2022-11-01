
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashSet<Integer> hash = new HashSet<Integer>(); // HashSet - 중복 걸러줌
		
		for(int i = 0; i < n; i++) {
			hash.add(sc.nextInt());
		}
		ArrayList<Integer> list = new ArrayList<Integer>(hash);
		
		Collections.sort(list);
		
		for(int i : list) {
			System.out.print(i + " ");
		}
        
	}
}
