class Solution {
    public int solution(int n, String control) {
        // 1. control을 배열로 쪼갠다.
        char[] chr = control.toCharArray();
        // 2. 조건에 따라 값을 조작한다.
        for(char c : chr) {
            switch(c) {
                case 'w' :
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        int answer = n;
        return answer;
    }
}