import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        
        if(arr2Length > arr1Length) answer = -1;
        if(arr2Length == arr1Length) {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            if(sum1 > sum2) answer = 1;
            if(sum1 == sum2) answer = 0;
            if(sum1 < sum2) answer = -1;
        }
        if(arr2Length < arr1Length) answer = 1;
        return answer;
        
    }
}