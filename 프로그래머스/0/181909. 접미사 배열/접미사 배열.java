import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            result.add(my_string.substring(i));
        }
        
        return result.stream().sorted().toArray(String[]::new);
    }
}