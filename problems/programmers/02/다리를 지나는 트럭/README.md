## [다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/42583)
### 문제 풀이
Queue를 다리라고 가정하고 문제를 풀어볼 수 있습니다. 

고려해야 할 조건이 몇 가지 있습니다.
- 트럭이 다리에 올라가면 1초가 시작되는 것.
- 그 후 다리 위에서 1칸씩 움직일 때마다 역시 1초가 흘러감.

다리(큐)에 트럭이 없는 상황, 다리에 트럭이 가득 찬 상황, 다리에 트럭이 있지만 아직 다리 길이만큼 트럭이 있지 않은 상황 총 3가지 상황으로 나누어 보겠습니다.

**큐가 비어있는 경우**

![image](https://github.com/user-attachments/assets/d4629595-21a3-4e88-a4ff-235c724c0a26)

큐가 비어있는 경우는 다리에 어떠한 트럭도 올라가지 않은 경우와 같습니다. 이럴 땐 그냥 트럭을 다리에 올려주면 됩니다.

그리고 현재 다리에 있는 트럭의 무게를 저장할 sum값에 올라간 트럭의 무게를 더해줍니다. 트럭이 다리 위에 올라갔으니 시간을 1초 추가합니다.

**큐가 다리 길이만큼 차지 않은 경우**
![image](https://github.com/user-attachments/assets/16f818c0-c59a-4500-ac54-f61d7633c73c)

이 때는 이미 다리에 있는 트럭의 무게와 다리에 올릴 다음 트럭의 무게를 비교해 다리에 올릴지 말지를 결정해야 합니다.

최대 무게가 10이고 현대 다리에 있는 트럭의 무게는 7이라고 가정합니다. 만약 다음 트럭이 4kg라면 전체 무게가 11이 되어 트럭을 다리에 올릴 수 없습니다. 이때 큐에 이미 있는 트럭이 다리를 지나갈 수 있도록 0 값을 넣어줍니다.

하지만 만약 다음 트럭이 3kg라면 전체 무게가 10이기 때문에 다음 트럭을 올리고 현재 무게에 다음 트럭의 무게를 더해줍니다.

이 두 과정 모두 트럭을 0이든 n kg이든 올리기 때문에 시간을 1초 추가합니다.

**큐가 가득 차 있는 경우**
![image](https://github.com/user-attachments/assets/23d83a76-ee18-48ef-b401-fca9dd7d170f)
이런 경우에는 그냥 큐에서 트럭을 꺼내주면 됩니다. 이 때 시간은 추가하지 않습니다.

### 코드
```Java
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayDeque<Integer> bridge = new ArrayDeque<>();
      
        int answer = 0;
        int sumOfTruckWeights = 0;
        
        for(int truck : truck_weights) {
            while(true) {
                // 1. 다리가 비어 있는 경우
                if(bridge.isEmpty()) {
                    bridge.add(truck);
                    sumOfTruckWeights += truck;
                    answer++;
                    break;
                }
                // 2. 다리가 가득 찬 경우
                else if(bridge.size() == bridge_length) {
                    sumOfTruckWeights -= bridge.poll(); 
                }
        
                // 3. 다리가 가득 차지 않은 경우
                else {
                    // weight가 초과되지 않게 다리에 트럭을 추가
                    if(sumOfTruckWeights + truck <= weight) {
                        bridge.add(truck);
                        sumOfTruckWeights += truck;
                        answer++;
                        break;
                    }
                    else {
                        bridge.add(0);
                        answer++;
                    }
                }
            }
        }
       
        return answer + bridge_length;
    }
}
```

### 시간복잡도
- N은 truck_weights의 길이이고 M은 bridge_length 입니다.
- **최종 시간복잡도 : O(N * M)**
