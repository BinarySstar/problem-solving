import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        if(length >= 11) {
            return Arrays.stream(num_list).sum();
        }
        return Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }
}