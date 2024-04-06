class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = 
            myString.replace("A", "X").replace("B", "A").replace("X", "B");
        
         for (int i = 0; i <= newString.length() - pat.length(); i++) {
            String subString = newString.substring(i, i + pat.length());
            if (subString.equals(pat)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}