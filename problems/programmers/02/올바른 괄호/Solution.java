import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> check = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') check.push(c);
            else {
                if (check.isEmpty() || check.pop() == c) return false;
            }
        }

        return check.isEmpty();
    }
}
