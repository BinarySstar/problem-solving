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
