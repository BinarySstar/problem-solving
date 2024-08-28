### 좌표평면
일반적으로 좌표평면을 이용한 구현 문제는 다음과 같은 조건을 가지고 있습니다.
- U : 위쪽으로 한 칸 가기
- D : 아래쪽으로 한 칸 가기
- R : 오른쪽으로 한 칸 가기
- L : 왼쪽으로 한 칸 가기

좌표평면 문제에 단골로 나오는 코드를 정리하였습니다.
### 좌표 유효성 검사
```Java
private static boolean isValidMove(int dx, int dy) {
  return 0 <= dx && dx < (최대 범위) && 0 <= dy && dy < (최대 범위);
}
```
### 좌표 결정을 위한 해시맵 생성 및 초기화
```Java
private static final HashMap<Character, int[]> location = new HashMap<>();

private static void initLocation() {
  location.put('U', new int[]{0, 1});
  location.put('D', new int[]{0, -1});
  location.put('R', new int[]{-1, 0});
  location.put('L', new int[]{1, 0});
}

public int solution(...) {
  initLocation();
  int dx = //...
  int dy = //...
  // ...
  if(!isValidMove(dx, dy)) // ...
}
```
