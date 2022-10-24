import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr;
		int temp = in.nextInt();
		
		for(int i = 0 ; i < temp ; i++) {
 
			int n = in.nextInt();	//학생 수 
			arr = new int[n];
			
			double sum = 0;	// 성적 누적 합 변수 
			
			// 성적 입력부분 
			for(int j = 0 ; j < n ; j++) {
				int score = in.nextInt();	// 성적 입력 
				arr[j] = score;
				sum += score;	// 성적 누적 합 
			}
			
			double total = (sum / n) ; // 평균점수
			double cnt = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] > total) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}
	}
}
