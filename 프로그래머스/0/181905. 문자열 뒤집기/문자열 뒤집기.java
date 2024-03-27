class Solution {
    public String solution(String my_string, int s, int e) {
        String substring = my_string.substring(s, e + 1);
        String reversedSubstring = new StringBuilder(substring).reverse().toString();
        return my_string.substring(0, s) + reversedSubstring + my_string.substring(e + 1);
    }
}