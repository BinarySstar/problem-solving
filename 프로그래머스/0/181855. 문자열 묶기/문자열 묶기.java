import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> groupSizes = new HashMap<>();

        // 문자열 배열을 순회하면서 각 문자열의 길이를 기준으로 그룹을 형성하고 그룹의 크기를 계산
        for (String str : strArr) {
            int length = str.length();
            groupSizes.put(length, groupSizes.getOrDefault(length, 0) + 1);
        }

        int maxGroupSize = 0;
        for (int size : groupSizes.values()) {
            maxGroupSize = Math.max(maxGroupSize, size);
        }

        return maxGroupSize;
    }
}
