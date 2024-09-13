## [올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java)
### 문제 풀이
여는 괄호 '('를 스택에 삽입하고 닫는 괄호 ')'가 등장할 때 스택에 있는 여는 괄호 '('를 꺼내오면 문제를 해결할 수 있습니다.

### 코드
```Java
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
```

### 시간복잡도
- N은 s의 길이입니다. s를 순회하며 괄호의 쌍을 확인하므로 시간복잡도는 O(N)입니다.
- 스택의 `push()`와 `pop()`의 시간복잡도는 O(1)입니다.
- **최종 시간복잡도 : O(N)**
