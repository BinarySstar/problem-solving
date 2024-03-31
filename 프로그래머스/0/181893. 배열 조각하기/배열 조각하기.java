import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int n : arr) {
            resultList.add(n);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                while (resultList.size() > query[i] + 1) {
                    resultList.remove(query[i] + 1);
                }
            }
            else {
                while (query[i] > 0) {
                    resultList.remove(0);
                    query[i]--;
                }
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}