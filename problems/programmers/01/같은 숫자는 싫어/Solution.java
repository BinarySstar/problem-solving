import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) stack.addFirst(arr[i]);
        }
        while(!stack.isEmpty()) {
            int j = stack.pollLast();
            answer.add(j);
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
