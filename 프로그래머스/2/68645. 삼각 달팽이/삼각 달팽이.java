class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n * (n+1) / 2];
        int[][] matrix = new int[n][n];
        
        int x = -1;
        int y = 0;
        int number = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) x++;
                if(i % 3 == 1) y++;
                if(i % 3 == 2) {x--; y--;}
                
                matrix[x][y] = ++number;
            }
        }
        
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++) {
                answer[k++] = matrix[i][j];
            }
        }
        
        return answer;
    }
}