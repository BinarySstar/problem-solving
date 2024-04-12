class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        int index = 0;

        for (String line : picture) {
            StringBuilder newLine = new StringBuilder();
            for (char c : line.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    newLine.append(c);
                }
            }
       
            for (int i = 0; i < k; i++) {
                result[index++] = newLine.toString();
            }
        }

        return result;
    }
}