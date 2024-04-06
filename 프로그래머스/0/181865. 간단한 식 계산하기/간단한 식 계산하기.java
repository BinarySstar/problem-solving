class Solution {
    public int solution(String binomial) {
        String[] expression = binomial.split(" ");
        int a = Integer.parseInt(expression[0]);
        int b = Integer.parseInt(expression[2]);
        int result = 0;
        
        switch(expression[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
        }
        return result;
    }
}