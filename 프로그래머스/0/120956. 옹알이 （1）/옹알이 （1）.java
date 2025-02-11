class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] speakingList = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < speakingList.length; j++){
                babbling[i] = babbling[i].replace(speakingList[j], " ");
            }
            
            if(babbling[i].trim().equals("")){
                answer++;
            }
            
        }
        return answer;
    }
}