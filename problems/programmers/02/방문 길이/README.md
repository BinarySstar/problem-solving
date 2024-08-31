## [방문 길이](https://school.programmers.co.kr/learn/courses/30/lessons/49994)
### 문제 풀이
문제에 제시된 그대로 구현을 진행합니다. **중복 경로는 최종 길이에 포함되지 않는다**는 점을 염두하여 구현해야 합니다. 중복을 피하기 위해 HashSet을 이용하여 경로를 기록합니다.

### 코드
```Java
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    
    private static boolean isValidMove(int nx, int ny) {
        return -5 <= nx && nx <= 5 && -5 <= ny && ny <= 5;
    }
    
    private static final HashMap<Character, int[]> location = new HashMap<>();
    
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }
    
    public int solution(String dirs) {
        initLocation();
        int x = 0;
        int y = 0;
        HashSet<String> answer = new HashSet<>();
        
        for(int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            
            // 좌표가 범위를 벗어가면 다음 경로 진행
            if(!isValidMove(nx, ny)) continue;
            
            // A에서 B로 간 경우와 B에서 A로 간 경우를 함께 추가
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            
            x = nx;
            y = ny;
        }
        
        return answer.size() / 2;
    }
}
```
- `answer.add()`에 해당하는 부분은 (x, y)에서 (nx, ny)로 간 경로를 기록한 것입니다. (nx, ny)에서 (x, y)로 간 경로를 미리 추가하여 중복되는 경로를 처음부터 추가합니다.
- 마지막에 HashSet의 크기의 절반이 경로의 길이가 됩니다.

### 시간복잡도
- N은 dirs 길이입니다. dirs의 길이  N만큼 좌표를 순회합니다.
- **최종 시간복잡도 : O(N)**
