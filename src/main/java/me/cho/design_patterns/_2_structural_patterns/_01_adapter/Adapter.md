# Adapter
클라이언트가 사용 할 수 있는 인터페이스는 정해져있는데 내가 기존에 사용하던 코드도 이미 정해져 있어서 서로 맞지가 않을 때
그 둘 사이를 메꿔 기존의 사용하던 코드를 재사용 할 수 있도록 해줍니다.

![어댑터 패턴 다이어그램](https://github.com/choomi1217/designPatterns/tree/master/diagrams/Adapter.png)

- Client : LoginHandler
- Target : security 하위 패키지
- Adaptee : Account, AccountService


# 무엇이 문제일까?
클라이언트가 기존에 사용하던 코드를 변경하지 않고 다른 애플리케이션이 제공하는 같은 기능을 사용하고 싶음

# 선생님의 진행 방식
1. Adapter 클래스(AccountUserDetailService) 생성
2. Adapter 클래스(AccountUserDetails) 생성
3. 위처럼 새로 만드는 것 말고도 다른 방법으로도 하심
4. 기존에 있던 Account가 UserDetails를, AccountService가 UserDetailsService를 직접 구현하도록 만든다.

# 장점과 단점
- 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어서 재사용 할 수 있음.
- 기존 코드가 하던 일과 인터페이스 구현체를 만드는 작업을 따로 만들어서 관리할 수도 있음.
- 클래스가 늘어나서 복잡할 수 있음.

# 실제 사용 사례
- `List<String> strings = Arrays.asList("a", "b", "c");`
- `Enumeration<String> enumeration = Collections.enumeration(strings);`
- `ArrayList<String> list = Collections.list(enumeration);`
- 아래 코드에서 Adapter 패턴이 적용된 곳
  - InputStream is = new FileInputStream("input.txt");
  - InputStreamReader isr = new InputStreamReader(is);
  - BufferedReader reader = new BufferedReader(isr);
```java
try(InputStream is = new FileInputStream("input.txt");
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader reader = new BufferedReader(isr);){
    while (reader.ready()){
        System.out.println(reader.readLine());
    }
}catch (IOException e){
    throw new RuntimeException(e);
}
```