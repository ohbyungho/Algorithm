class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        int move = 0; //0 오른쪽, 1 아래, 2 왼쪽, 3 위로
        
        while(value <= n * n){
            answer[row][col] = value++;
            
            if(move == 0){
                if(col == n - 1 || answer[row][col + 1] != 0 ){
                    move = 1;
                    row++;
                }else{
                    col++;
                }
            }else if(move == 1){
                if(row == n - 1 || answer[row + 1][col] != 0){
                    move = 2;
                    col--;
                }else{
                    row++;
                }
            }else if(move == 2){
                if(col == 0 || answer[row][col - 1] != 0){
                    move = 3;
                    row--;
                }else{
                    col--;
                }
            }else if(move == 3){
                if(row == 0 || answer[row - 1][col] != 0){
                    move = 0;
                    col++;
                }else{
                    row--;
                }
            }
        }
        
        return answer;
    }
}