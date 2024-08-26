## [두 개 뽑아서 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/68644) 
### 문제 풀이
문제에 제시한 요구사항 대로 따라가면 됩니다. 주의할 점은 테스트 케이스에서 입력값 [5, 0, 2, 7]에 대해 반환값이 2 + 5, 0 + 7으로 7이 둘이 아닌 하나입니다. 중복값을 제거해야 함에 유의하여 문제를 풀 수 있습니다.
numbers의 최대 길이는 100이므로 시간복잡도는 충분히 여유있다고 생각하였습니다. 풀이과정은 다음과 같습니다.
1. 배열에서 두 수를 선택
2. 과정 1에서 구한 수를 합하여 배열에 저장
3. 배열 내 중복 요소를 제거하고 오름차순으로 저장

### 풀이
```Java
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        return list.stream().sorted().distinct().mapToInt(Integer::intValue).toArray();
    }
}
```

### 시간복잡도
- N은 numbers의 길이입니다.
- 이중 반복문을 통해 모든 원소들의 대한 두 수의 합을 구하는 연산의 시간복잡도는 O(N^2)입니다. 
- list 내의 원소는 N^2개 이고 이를 `sorted()` 메서드를 이용하여 정렬하는 연산의 시간복잡도는 O(N^2 * log(N^2))입니다.
- `distinct()`를 이용하여 중복을 제거하는 연산의 시간복잡도는 평균 O(N)이며 list 내 원소의 개수는 N^2개 이므로 시간복잡도는 O(N^2)입니다.
- **최종 시간복잡도 : O(N^2 * log(N^2))**
