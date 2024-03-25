class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] chr = my_string.toCharArray();
        for(int i = 0; i < index_list.length; i++) {
            sb.append(chr[index_list[i]]);
        }

        return sb.toString();
    }
}