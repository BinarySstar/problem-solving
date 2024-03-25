class Solution {
    public int solution(String number) {
        int a = 0;
        for(int i = 0; i < number.length(); i++) {
            a += Character.getNumericValue(number.charAt(i));
        }
        return a % 9;
    }
}