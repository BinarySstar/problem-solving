import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
            else {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        System.out.println(new String(charArray));
    }
}