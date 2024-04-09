import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int target = 1;
        while(target < length) {
            target *= 2;
        }
        
        int[] answer = new int[target];
        Arrays.fill(answer, 0);
        for(int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}