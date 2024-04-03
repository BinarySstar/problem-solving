import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0; 

        while (true) {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
            }
          
            if (Arrays.equals(newArr, arr)) {
                break; 
            }
            arr = newArr; 
            count++; 
        }

        return count; 
    }
}
