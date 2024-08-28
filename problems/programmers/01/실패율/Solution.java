import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수
        int[] challenger = new int[N + 2];
        for(int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }
        
        // 스테이지별 클리어하지 못한 도전자 수 계산
        HashMap<Integer, Double> failures = new HashMap<>();
        double total = stages.length;
        
        for (int i = 1; i <= N; i++) {
            // 도전하는 사람이 없으면 실패율은 0
            if(challenger[i] == 0) failures.put(i, 0.0);
            else {
                failures.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        
        return failures.entrySet()
            .stream()
            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue())).mapToInt(HashMap.Entry::getKey)
            .toArray();
        
    }
}
