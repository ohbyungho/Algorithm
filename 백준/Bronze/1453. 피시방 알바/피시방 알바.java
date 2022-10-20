import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		boolean[] flag = new boolean[101];
		int cnt = 0;
		for (int i = 0; i < temp; i++) {
			int k = sc.nextInt();
			//앉은 사람이 있을때
			if(flag[k] == true) {
				cnt++; //거절
				//앉은 사람이 없으면
			}else {
				flag[k] = true;
			}
		}
		System.out.println(cnt);
	}
}