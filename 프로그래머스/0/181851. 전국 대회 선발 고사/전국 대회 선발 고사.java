import java.util.stream.IntStream;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] compare = IntStream.range(0, attendance.length)
            .filter(i -> attendance[i])
            .boxed()
            .sorted(Comparator.comparingInt(i -> rank[i]))
            .limit(3)
            .mapToInt(Integer::intValue)
            .toArray();
        
        return 10000 * (compare[0]) + 100 * (compare[1]) + (compare[2]);
    }
}
