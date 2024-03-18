import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int product = Arrays.stream(num_list)
            .reduce(1, (a, b) -> a * b);

        int answer = product < sum * sum ? 1 : 0 ;
        return answer;
    }
}