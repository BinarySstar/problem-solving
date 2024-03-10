class Solution {
    public int solution(int a, int b) {
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        
        int m = Integer.parseInt(aString + bString);
        int n = Integer.parseInt(bString + aString);
        
        int answer = m > n ? m : n;
        return answer;
    }
}