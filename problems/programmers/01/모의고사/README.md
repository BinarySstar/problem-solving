## [모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840) 
### 문제 풀이
문제에 제시된 수포자들의 반복 패턴을 확인할 수 있었습니다. 
- 수포자 1 : 1 2 3 4 5
- 수포자 2 : 2 1 2 3 2 4 2 5
- 수포자 3 : 3 3 1 1 2 2 4 4 5
  
처음 반복되는 구간과 정답 배열을 비교하면 문제를 해결할 수 있습니다. 만약 정답의 길이가 수포자의 패턴보다 길다면 수포자의 패턴 길이에 해당하는 정답은 그대로 채점하고, 길이가 초과되는 시점에는 패턴의 처음 부분부터 비교하면 됩니다.
![image](https://github.com/user-attachments/assets/b5138acc-bde1-432c-8c32-f38c72ca1731)



### 코드
```Java
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < scores.length; j++) {
                if(answers[i] == pattern[j][i % pattern[j].length]) {
                     scores[j]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
```
- 수포자들의 패턴을 저장한 2차원 정수 배열을 선언합니다.
- 수포자들의 점수를 저장하는 배열을 선언합니다.
- 각 수포자의 패턴과 정답이 얼마나 일치하는지 확인하고 점수를 계산합니다.
- 가장 높은 점수를 가진 수포자들의 번호를 리스트에 담아 배열로 반환합니다.

### 시간복잡도
- N은 answers의 길이입니다.
- 각 수포자의 패턴과 정답이 얼마나 일치하는지 확인하는 연산의 시간복잡도는 O(N)입니다. 
- 가장 높은 점수를 가진 수포자들의 번호를 리스트에 담는 연산의 시간복잡도는 O(N)입니다.
- **최종 시간복잡도 : O(N)**
