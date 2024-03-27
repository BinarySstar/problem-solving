class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        char [] chr = code.toCharArray();
        for(int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(chr[i]);
            }
        }
        return sb.toString();
    }
}