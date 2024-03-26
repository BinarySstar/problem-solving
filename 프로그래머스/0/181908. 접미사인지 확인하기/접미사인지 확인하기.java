import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> suffix = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            suffix.add(my_string.substring(i));
        }
        
        for(int i = 0; i < suffix.size(); i++) {
            if(is_suffix.equals(suffix.get(i))) return 1;
        }
        return 0;
    }
}