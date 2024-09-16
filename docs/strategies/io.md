## 코딩테스트에서의 자바 입출력
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
            // int N = Integer.parseInt(br.readLine()); 정수형을 입력받고자 함
	}
}
```
BufferedReader의 readLine() 메소드를 통해 str에 문자열을 저장할 수 있습니다. readLine()으로 입력받으면 문자열(String)로 저장됩니다.
### 공백으로 구분된 문자열 또는 정수 여러 개를 입력받을 때
```
A B C
```
예시와 같이 한 줄에 문자 여러 개를 입력받고자 하면 StringTokenizer를 이용하여 저장합니다.
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
<hr/>

```
8 3
```

예시와 같이 한 줄에 정수 여러 개를 입력받고자 하면 코드는 다음과 같습니다.
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	}
}
```
<hr/>

```
3 5
0 1 2 3 4
```

다음 입력 예제에서 첫째 줄에는 임의의 정수 N, M을 입력받고 둘째 줄에는 M개의 정수를 입력받고자 합니다. 위 경우에는 StringTokenizer와 반복문을 이용하여 입력받을 수 있습니다. 주의할 점은 StringTokenizer를 2번 선언해줘야 합니다.
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] data = new int[M];
		st = new StringTokenizer(br.readLine()); // st 재선언
		
		for (int i = 0; i < M; i++) {
			data[i]= Integer.parseInt(st.nextToken());
		}	
	}
```
<hr/>

### 문자열을 입력받고 각각을 하나의 문자로 분리하고 싶을 때

```
1234567890
```
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		for(char c : N.toCharArray()) {
			...
		}
	}
}
```
### 문자열을 연결할 때는 + 연산자 말고 StringBuilder를 이용한다. ([참고](https://github.com/BinarySstar/problem-solving/blob/master/docs/strategies/string.md))
StringBuilder는 lang 패키지에 존재하므로 별도의 import문이 필요가 없습니다.
입력이 다음과 같다고 가정합니다.
```
3 5
0 1 2 3 4
```
```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] data = new int[M];
		st = new StringTokenizer(br.readLine()); // st 재선언
		
		for (int i = 0; i < M; i++) {
			data[i]= Integer.parseInt(st.nextToken());
			sb.append(data[i]).append(" ");
		}	
		System.out.println(sb);
	}
}
```
출력은 다음과 같습니다.
```
0 1 2 3 4
```
