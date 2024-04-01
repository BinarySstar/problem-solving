import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] list1 = Arrays.stream(num_list).skip(n).toArray();
        int[] list2 = Arrays.stream(num_list).limit(n).toArray();
        
        return Arrays.stream(new int[][] {list1, list2})
            .flatMapToInt(Arrays::stream)
            .toArray();
    }
}