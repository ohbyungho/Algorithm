// 1번 풀이
//import java.util.Arrays;

//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        int[] arr = Arrays.stream(nums).distinct().toArray();
//        
//        if(arr.length > nums.length / 2){
//            answer = nums.length / 2;
//        }else{ 
//            answer = arr.length;
//        }
//        
//        return answer;
//    }
//}

// 2번 풀이
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> kinds = new HashSet<>();
        
        for (int num : nums) {
            kinds.add(num);
        }

        int maxPick = nums.length / 2;

        return Math.min(kinds.size(), maxPick);
    }
}
