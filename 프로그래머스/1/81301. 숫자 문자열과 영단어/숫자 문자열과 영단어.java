class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four",
                         "five", "six", "seven", "eight", "nine"
                          ,"ten"};
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < words.length; i++) {
            int index = sb.indexOf(words[i]);
            while (index != -1) {
                sb.replace(index, index + words[i].length(), String.valueOf(i));
                index = sb.indexOf(words[i], index + 1);
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}