class Solution {
    public String solution(String my_string) {
        
        String answer = my_string;
        String[] seiou = {"a", "e", "i", "o", "u"};
        
    
        for(int i = 0; i < seiou.length; i++){
            answer = answer.replace(seiou[i], "");
        }
        return answer;
    }
}