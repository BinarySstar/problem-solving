import java.util.HashMap;
import java.util.HashSet;

class Solution {
    
    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx <= 10 && 0 <= ny && ny <= 10;
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
        int x = 5;
        int y = 5;
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
