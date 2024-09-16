import java.util.*;

class Solution {
  public int solution(int[] priorities, int location) {
    PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

    // 우선순위가 높은 순으로 알아서 정렬됨
    for(int num : priorities) {
      queue.add(num);
    }
        
    int answer = 0;
    
    while(!queue.isEmpty()) {
      for(int i = 0; i < priorities.length; i++) {
        if(queue.peek() == priorities[i]) {
          queue.poll();
          answer++;
                    
          if(i == location) return answer;
        }
      }
    }
    return answer;
    }
}
