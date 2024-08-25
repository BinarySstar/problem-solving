## 배열
- 인덱스와 값이 일대일 대응해 관리하는 자료구조

### 배열 선언
```Java
int[] arr = {0, 0, 0, 0, 0};
int[] arr = new int[5];
```
### ArrayList
- 자바에서 제공하는 크기가 동적으로 변경되는 배열

### ArrayList 활용
#### ArrayList 선언 및 데이터 추가
```Java
ArrayList<Integer> list = new ArrayList<>(); // 정수를 저장하는 ArrayList

list.add(1);
list.add(2);
list.add(3);

list.toString(); // [1, 2, 3]
```
- 리스트 맨 마지막에 `add(E e)`를 사용하여 데이터를 추가

#### 데이터 접근
```Java
ArrayList<Integer> list = new ArrayList<>(); // 정수를 저장하는 ArrayList

list.add(1);
list.add(2);
list.add(3);

list.get(1); // 2
```
- `get(int index)`을 이용하여 인덱스 위치의 요소를 반환

#### 데이터 삭제
```Java
ArrayList<Integer> list = new ArrayList<>(); // 정수를 저장하는 ArrayList

list.add(1);
list.add(2);
list.add(3);

list.remove(list.size() - 1); // list 마지막 데이터 삭제
list.toString(); // [1, 2]
```
- `remove(int index)`을 이용하여 인덱스 위치의 요소를 제거
- 배열의 크기를 구하는 `size()`

### 배열을 선택할 때 고려해야 할 요소
데이터에 자주 접근하거나 읽어야 하는 경우에는 배열이 좋은 선택이지만 메모리 공간이 정적, 즉 메모리 공간이 변하지 않고 고정이므로 사전에 충분한 메모리 공간 확보가 필요합니다.
따라서 문제를 풀 때는 다음 사항을 고려하여 효율적인 선택을 해야 합니다.
- **할당할 수 있는 메모리 크기를 확인** : 크기가 고정되었다면 데이터 접근에서 ArrayList 보다는 배열이 조금 더 높은 성능을 보입니다.
- **데이터 삽입 연산이 빈번한지 확인** : 배열의 중간 혹은 처음에 데이터를 빈번하게 삽입하면 시간 복잡도가 O(n)으로 시간 초과 위험이 증가합니다.

### 예제로 보는 배열과 ArrayList 메서드
```Java
int[] arr = {1, 2, 4, 5, 3};
arr.length; // (결과 : 5)
Arrays.sort(arr); // (결과 : [1, 2, 3, 4, 5])
Arrays.toString(arr); // (결과 : [1, 2, 3, 4, 5] 가 출력됨)

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
list.size() //  (결과 : 5)
list.isEmpty() //  (결과 : false)
Collections.sort(list) // (결과 : [1, 2, 3, 4, 5])
```
| 코드                                           | 설명                                          |
|------------------------------------------------|------------------------------------------------|
| `length;`                                   | 배열의 길이를 반환하는 변수              |
| `Arrays.sort();`                             | Arrays에서 제공하는 정렬 메서드 
| `Arrays.toString();`                         | Arrays에서 제공하는 배열을 String으로 변환하는 메서드 |
| `list.size();`                                  | ArrayList의 크기를 반환하는 메서드            |
| `list.isEmpty();`                               | ArrayList에 저장된 데이터 유무 결과를 반환하는 메서드  |
| `Collections.sort();`                       | Collections에서 제공하는 ArrayList의 요소를 정렬하는 메서드 |
