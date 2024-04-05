class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int maxLength = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) {
                int endIndex = i + pat.length();
                if (endIndex > maxLength) {
                    maxLength = endIndex;
                    answer = myString.substring(0, endIndex);
                }
            }
        }
        
        return answer;
    }
}
