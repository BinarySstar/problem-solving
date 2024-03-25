class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] index = parts[i];
            
            sb.append(str.substring(index[0], index[1] + 1));
        }
        return sb.toString();
    }
}