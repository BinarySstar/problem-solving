## [같은 숫자는 싫](https://school.programmers.co.kr/learn/courses/30/lessons/12906)
### 문제 풀이
문제의 요구사항을 보았을 때, 스택 자료구조를 활용하고 중복을 피하여 정수를 삽입하면 쉽게 해결할 수 있을 것이라 생각하였습니다.

### 코드
```Java
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
```
- 정답으로 활용할 ArrayList와 ArrayDeque를 이용하여 스택을 구현합니다.
- 맨 처음 숫자는 무조건 스택에 push 되어야 합니다.
- arr를 순회하여 조건에 맞으면 스택에 정수를 추가합니다.
- 스택에 있는 자료를 꺼내와 answer에 삽입합니다.

### 시간복잡도
- N은 arr의 크기입니다.
- arr의 첫 번째 원소를 stack에 push하는 연산의 시간복잡도는 O(1)입니다.
- arr을 순회하여 조건에 맞으면 스택에 정수를 추가하는 연산의 시간복잡도는 O(N)입니다.
- stack의 크기를 M이라고 하면 M의 최댓값은 N이 됩니다.
- **최종 시간복잡도 : O(N)**
