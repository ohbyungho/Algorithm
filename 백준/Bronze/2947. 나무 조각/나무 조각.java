import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
        //주어진 숫자 입력받기
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        //정렬 시작
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                if(nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    for (int num : nums) {
                        System.out.print(num+" ");
                    }
                    System.out.println();
                }
            }
        }
	}
}
