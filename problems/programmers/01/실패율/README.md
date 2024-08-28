## [실패율](https://school.programmers.co.kr/learn/courses/30/lessons/42889)
### 문제 풀이
문제에 제시된 **실패율**의 의미를 이해해보겠습니다. 첫 번째 입출력 예제를 이용하겠습니다.
| N  | Stages                         | Result            |
|----|--------------------------------|-------------------|
| 5  | [2, 1, 2, 6, 2, 4, 3, 3]       | [3, 4, 2, 1, 5]   |

![image](https://github.com/user-attachments/assets/d69ff5c6-8eed-4923-8e8d-22c30824bb58)
stages의 요소는 도전자들의 현재 스테이지 수입니다. 다시 말해, **아직 해당 스테이지를 클리어하지 못하고 진행중인 도전자**입니다. 그림에서 설명한 대로 각 스테이지의 실패율을 구하고 실패율을 기준으로 내림차순 정렬을 진행하여 배열로 반환합니다.
제약 조건에서 stages의 길이는 최대 200,000이므로 O(N^2)의 시간복잡도를 갖는 알고리즘을 사용하면 시간초과가 발생할 우려가 있습니다. 따라서 O(N logN)의 시간복잡도를 갖는 알고리즘을 사용해야할 것 같습니다.
### 코드
```Java
import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수
        int[] challenger = new int[N + 2];
        for(int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }
        
        // 스테이지별 클리어하지 못한 도전자 수 계산
        HashMap<Integer, Double> failures = new HashMap<>();
        double total = stages.length;
        
        for (int i = 1; i <= N; i++) {
            // 도전하는 사람이 없으면 실패율은 0
            if(challenger[i] == 0) failures.put(i, 0.0);
            else {
                failures.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        
        return failures.entrySet()
            .stream()
            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue())).mapToInt(HashMap.Entry::getKey)
            .toArray();
        
    }
}
```
- 스테이지별 도전자 수를 저장하는 정수형 challenger배열을 선언합니다. 편의를 위해 0번째 요소는 사용하지 않고, 이에 따라 배열의 길이를 (N + 1) + 1로 정했습니다.
- '키-값'으로 구성된 해시맵 failures를 선언하여 각 스테이지 별로 실패율을 저장합니다.
- 실패율을 계산하기 위해 총 도전자 수를 이용해야할 필요가 있습니다. total 변수를 선언하고 활용합니다.

### 시간복잡도
- N은 스테이지 개수이고 stages의 길이는 M이라고 가정합니다.
- 각 스테이지의 도전자 수를 계산할 때 시간복잡도는 O(N + M)입니다.
- 스테이지 별로 실패율을 계산할 때 시간복잡도는 O(N)입니다.
- `sorted()`를 이용하여 스테이지를 정렬할 떄의 시간복잡도는 O(N logN)입니다.
- **최종 시간복잡도 : O(M + N log N)**
