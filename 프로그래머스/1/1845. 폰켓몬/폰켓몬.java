// 1번 풀이
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] arr = Arrays.stream(nums).distinct().toArray();
               
        return Math.min(arr.length, nums.length / 2);
        
        /** 풀이 1
            if(arr.length > nums.length / 2){ 
                answer = nums.length / 2;
            }else{ 
                answer = arr.length;
             }

             return answer;                             
        */ 

        /** 풀이 2        
            HashSet<Integer> kinds = new HashSet<>();

            for (int num : nums) {
                kinds.add(num);
            }

            int maxPick = nums.length / 2;

            return Math.min(kinds.size(), maxPick);
        */
        
    }
}
