import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 시작 입력 값
		int b = sc.nextInt(); // 끝 입력 값
		
		int[] arr = new int[1000]; // 수열 배열 생성
		int check = 1; // 값 비교
		int cnt = 0; // 값 비교
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = check; // 
			cnt++;
			if(cnt == check) {
				check++;
				cnt = 0;
			}
		}
		int sum = 0; // 합 변수 생성
		
		for(int i = a - 1; i < b; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
