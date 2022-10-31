import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 사람의 수
		int m = sc.nextInt(); // m 만큼 공 받으면 게임 끝
		int l = sc.nextInt(); // 공 받은 횟수가 홀수면 시계 방향으로 l 만큼 이동 짝수면 반시계 방향으로 l 만큼 이동

		int[] arr = new int[n + 1];

		int index = 1; // 배열의 위치를 저장하는 변수

		int cnt = 0; // 몇번 돌았는지 카운트

		arr[1] = 1; // 첫 번쨰 사람이 처음 공을 받고 시작

		while (true) {
			if (arr[index] == m) {
				break;
			}
			if (arr[index] % 2 == 0) { // 짝수라면
				index -= l; // 반시계 방향이므로 l 만큼 빼준다.
				if (index <= 0) {
					index += n; // 0보다 작거나 같으면 n만큼 더해줘서 끝점으로 바꾸어준다.
				}
				arr[index]++;
				cnt++;
			} else { // 홀수일 경우
				index += l; // 시계 방향이므로 l만큼 더해준다.
				if (index > n) { // 인덱스가 n보다 커지면
					index -= n; // n만큼 빼서 위치를 잡아준다.
					if (index == 0) {
						index = 1;
					}
				}
				arr[index]++;
				cnt++;

			}
		}
		System.out.println(cnt);
	}

}
