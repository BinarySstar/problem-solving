import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        int N = (last > secondLast) ? last - secondLast : 2 * last;
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[num_list.length] = N;
        
        return answer;
    }
}