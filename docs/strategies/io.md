### 코딩테스트에서의 자바 입출력
> **입력은 Scanner 대신 BufferedReader로 입력받는다.**

BufferedReader 방식이 Scanner 방식보다 버퍼가 더 크기 때문에 입력을 받는 속도 면에서 시간을 단축할 수 있습니다.
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
}
```
### 문자열 하나 또는 정수 하나만 입력받을 때
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            	String str = br.readLine();
            // int N = int N = Integer.parseInt(br.readLine()); 정수형을 입력받고자 할 
	}
}
```
BufferedReader의 readLine() 메소드를 통해 str에 문자열을 저장할 수 있습니다. readLine()으로 입력받으면 문자열(String)로 저장됩니다.
### 공백으로 구분된 문자열 또는 정수 여러 개를 입력받을 때
`A B C`과 같이 한 줄에 문자 여러 개를 입력받고자 하면 StringTokenizer를 이용하여 저장합니다.
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		String C = st.nextToken();
	}
}
```
