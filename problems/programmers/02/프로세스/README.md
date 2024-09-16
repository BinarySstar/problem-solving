## [프로세스](https://school.programmers.co.kr/learn/courses/30/lessons/42587)
### 문제 풀이
우선순위 큐를 활용하면 어렵지 않게 풀 수 있었습니다. 큐에 우선순위가 높은 순으로 데이터를 삽입하고 큐의 데이터를 꺼내는 작업을 반복하면 됩니다.

### 코드
```Java
import java.util.*;

class Solution {
  public int solution(int[] priorities, int location) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

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
```

### 시간복잡도
- N은 priorities의 길이입니다. N의 범위는 1 이상 100 이하이므로 시간복잡도에 크게 부담은 없었습니다.
- queue의 크기는 N이고 isEmpty() 반복문 순회 시 O(N) 시간복잡도를 가집니다. 내부에 priorities 길이만큼 반복문이 진행됩니다.
- **최종 시간복잡도 : O(N^2)**
