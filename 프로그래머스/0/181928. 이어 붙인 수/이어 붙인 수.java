import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int oddSum = Arrays.stream(num_list)
            .filter(n -> n % 2 == 1)
            .reduce(0, (sum, n) -> sum * 10 + n); 

        int evenSum = Arrays.stream(num_list)
            .filter(n -> n % 2 == 0)
            .reduce(0, (sum, n) -> sum * 10 + n); 

        return oddSum + evenSum;
    }
}
