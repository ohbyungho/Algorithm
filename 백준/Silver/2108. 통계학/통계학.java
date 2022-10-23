import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		double avg = 0; // 평균 구하기 변수
		int temp = Integer.parseInt(br.readLine()); // 숫자 개수 변수
		int length = 0; // 범위 변수
		int arr[] = new int[temp]; // 숫자 담을 변수
		for(int i = 0; i < temp; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		
		// 최빈값 구하는 반복문
		int max = -1; // 빈도수
		int cnt = 0; // 몇번 출현했는지 변수
		// 모두 1개씩 있을 경우 때문에 처음 최빈값은 배열의 첫번째 값으로 저장해 준다.
		int mod = arr[0]; // 최빈값 담을 변수
		boolean check = false;
		//최빈값 구하는 반복문
		for(int i = 0; i < temp - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				cnt++;
			}else {
				cnt = 0;
			}
			
			if(max < cnt) {
				max = cnt;
				mod = arr[i];
				check = true;
			}else if(max == cnt && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;
		length = arr[arr.length - 1] - arr[0];
		bw.write(Math.round(avg) + "\n"); // 반올림
		bw.write(Math.round(arr[temp / 2]) + "\n"); // 중앙값
		bw.write(mod + "\n"); // 중앙값
		bw.write(length + "\n"); // 범위
		
		bw.flush();
		bw.close();
		br.close();
	}

}
