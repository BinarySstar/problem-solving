### ✅ 문자 추출 charAt()
```Java
String str = "공주대학교 컴퓨터공학과";
char charValue = str.charAt(3); // charValue == '학'
```
### ✅ 문자열 길이 length()
```Java
String str = "공주대학교 컴퓨터공학과";
int length = str.length(); // length == 12
```
### ✅ 문자열 대체 replace()
```Java
String str = "공주대학교 컴퓨터공학과";
String newStr = str.replace("컴퓨터공학과", "소프트웨어학과");
//newStr = "공주대학교 소프트웨어학과"
```
### ✅ 문자열 잘라내기 substring()
```Java
String ssn = "011001-1234567";
String firstNumber = ssn.substring(0,6); // firstNumber == "011001"
String secondNumber = ssn.substring(7); // secondNumber == "1234567"
```
### ✅ 문자열 찾기 indexOf()
```Java
String str = "공주대학교 컴퓨터공학과";
int index = str.indexOf("컴퓨터"); // index == 6
int index2 = str.indexOf("이진성") // index2 == -1 (포함하지 않으면 -1 반환)
```
### ✅ 문자열 분리 split()
```Java
String str = "공주대학교 컴퓨터공학과";
String[] arr = str.split(" "); //arr[0] = "공주대학교" , arr[1] = "컴퓨터공학과"
```
### ✅ 문자열 변환 valueOf()
```Java
static String valueOf(boolean b)
static String valueOf(char c)
static String valueOf(int i)
static String valueOf(long l)
static String valueOf(double d)
static String valueOf(float f)
```
### ✅ 문자열 수정 StringBuffer
자바에서 String 객체는 값을 변경할 수 없는 Immutable 객체입니다. String 변수에 + 연산으로 문자열을 연결한 것은 **내부적으로 보았을 때는 새로운 String 객체를 생성한 것입니다.** 
예를 들어 다음과 같은 문자열 "abc"가 있고 "def"를 뒤에 붙이려고 합니다.
```Java
String s = "abc";
s += "def"
System.out.println(s); // abcdef
```
s의 값을 출력했을 때는 abcdef로 나오지만 s가 나오기까지 적용된 연산은 다음과 같습니다.
1. 새로운 String s 객체 생성
2. s가 가진 "abc"를 하나씩 복사
3. "abc" 뒤에 "def" 저장
`s += "def";` 에서만 많은 연산이 진행되었습니다. 이는 시간복잡도 관점에서 매우 큰 손해로 이어질 수 있습니다.

이러한 문제를 해결하기 위해 StringBuffer와 StringBuilder를 이용할 수 있습니다. **보통 코딩테스트에서는 스레드를 생성하고 활용할 일이 거의 없기 때문에 Thread-Safe 하지 않은 StringBuilder 클래스를 이용합니다.**
```Java
// StringBuilder 객체 생성
StringBuilder sb = new StringBuilder();

// 문자열 추가
sb.append(10);
sb.append("ABC"); // sb == "10ABC"

// 인덱스를 이용한 문자 삭제
sb.deleteCharAt(3); // 3번째 인덱스 문자 삭제, sb == 10AC

// 인덱스를 이용한 문자 삽입
sb.insert(1, 2); // 1번째 인덱스에 2라는 문자 추가, sb == 120AC
```
