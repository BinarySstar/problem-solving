import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.stream(str_list).forEach(list::add);
        
        int lIndex = list.indexOf("l");
        int rIndex = list.indexOf("r");
        
        if (lIndex == -1 && rIndex == -1) {
            return new String[0];
        }
        
        // "l"이 "r"보다 앞에 있거나, "r"만 있으면,
        // "l" 또는 "r"을 기준으로 왼쪽 부분 리스트를 반환합니다.
        if (lIndex != -1 && (rIndex == -1 || lIndex < rIndex)) {
            return list.subList(0, lIndex).toArray(new String[0]);
        }
        
        // "r"이 "l"보다 앞에 있으면
        if (rIndex != -1) {
            return list.subList(rIndex + 1, list.size()).toArray(new String[0]);
        }
        
        return new String[0];
    }
}