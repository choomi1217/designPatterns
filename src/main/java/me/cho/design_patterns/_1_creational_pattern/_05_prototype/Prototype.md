# Prototype
기존 인스턴스를 복제해서 새로운 인스턴스.
기존 객체 응용해서 새로운 객체 만들기.

# 무엇이 문제일까?
- 리소스가 많이 드는 인스턴스의 경우 다시 생성하기엔 리소스가 너무 많이 들기 때문에

### 리소스가 많이 드는 인스턴스란?
DB에서 읽어오거나 Network 요청 후 인스턴스를 만드는 식의 경우


# 선생님의 진행방식
1. 퀴즈 내심.
2. 인스턴스를 만들고 해당 인스턴스를 clone 했을때
3. `복제품 == 원본` 인가? -> 아니, 다르다.
4. `복제품.equals(원본)` 인가? -> 맞다, 같다. 인스턴스는 다르지만 안에 내용이 같다.
```java
public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("oomi");
        repository.setName("design-pattern-study");

        GithubIssue issue = new GithubIssue(repository);

        GithubIssue clone = issue1.clone();
        clone == issue1;
        clone.equals(issue1);
    }

}
```
5. GithubIssue 에 clone 메소드를 override 하기 위해 `Cloneable`을 implements 한다.
6. Object가 제공하는 clone 메소드를 그냥 사용.
7. 선생님께서 내준 퀴즈를 풀기 위해 equals와 hashcode를 override 함.
8. 선생님과 퀴즈 해답
> 문제
```java
System.out.printf("!=       : %b %n",clone != issue1);
System.out.printf("equals   : %b %n", clone.equals(issue1));
System.out.printf("getClass : %b %n", clone.getClass() == issue1.getClass());
```
> 답
```text
//해답
!=       : true 
equals   : true 
getClass : true 
```
9. clone의 얕은 복사에 대해 설명 하시곤 clone 메소드를 override 하여 깊은 복사로 변경.

# super.clone 에 대해
- 이 메서드는 "깊은 복사" 작업이 아니라 이 개체의 "얕은 복사"를 수행합니다.
- 복제품은 원본의 주소를 가리키고 있는것. (원본이 바뀌면 복제품도 바뀐다는 이야기입니다.)

# 장점과 단점
- 복잡한 인스턴스 생산 과정을 숨길 수 있다.
- 기존 객체를 복사하는게 새 인스턴스를 만드는 것보다 효율적일 수도 있다.
- 추상적인 타입을 리턴할 수 있다.(해당 객체)

# 실제 사용 사례
- ArrayList와 같은 구체적인 컬렉션 클래스는 `Cloneable` 사용하지만 List는 Clone이 없음.
  - `List<Student> clone = new ArrayList<>(students);` 이처럼 생성자로 복사해서 사용.
