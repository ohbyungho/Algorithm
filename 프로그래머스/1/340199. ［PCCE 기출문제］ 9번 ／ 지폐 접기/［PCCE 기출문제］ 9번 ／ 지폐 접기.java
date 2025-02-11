class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int walletMax = Math.max(wallet[0], wallet[1]);
        int walletMin = Math.min(wallet[0], wallet[1]);
        int billMax = Math.max(bill[0], bill[1]);
        int billMin = Math.min(bill[0], bill[1]);
        
        while(true){
            if(walletMin < billMin || walletMax < billMax){
                billMax = billMax / 2;
                answer++;
            }
            
            if(billMax < billMin){ 
                int temp = billMin;
                    billMin = billMax;
                    billMax = temp;
            }
            
            if(walletMax >= billMax && walletMin >= billMin){
                break;
            }
            
            
        }
        
        
        
        return answer;
    }
}