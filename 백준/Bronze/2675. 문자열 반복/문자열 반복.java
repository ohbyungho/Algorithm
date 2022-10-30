import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    // 테스트 케이스의 개수
	    int T = sc.nextInt();
	    // 반복횟수
	    int R;
	    // 문자형 배열
	    char[] S;

	    for(int i = 0; i < T; i++){
	      R = sc.nextInt();
	      S = sc.next().toCharArray();

	      for(int x = 0; x < S.length; x++){
	        for(int y = 0; y < R; y++){
	          System.out.print(S[x]);
	        }
	      }
	        System.out.println();
	    }
	}

}
