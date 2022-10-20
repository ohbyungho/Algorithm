class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i] < array[j]){
                   answer[0] = array[j];
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            if(answer[0] == array[i]){
                answer[1] = i;
            }
        }
        
        return answer;
    }
}