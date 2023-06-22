# 프록시 (Proxy) 패턴
> 클라이언트가 객체에 직접 접근하는게 아니고 Proxy(대리인) 거쳐서 사용하는 패턴

```java
public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
```

```java
public class GameService {
    public void startGame() {
        System.out.println("Game Start!"); 
    }
}
```

# 무엇이 문제인가?
- 만약 GameService에 코드를 아무것도 손대지 못하는 상황에서 게임을 시작할 때부터 게임을 종료할 때까지 얼마나 걸리는지 시간을 측정하고 싶다면?
  -  main 메소드 안에서 `gameService.startGame();` 이 부분 앞,뒤로 측정하는 메소드를 넣으면 되겠지만.. 🤔
 

# 선생님 진행방식 1 - 상속을 쓸 수밖에 없는 경우
~~인터페이스를 쓸 수만 있다면 **GameService 를 인터페이스로 만드는게 최고**~~
1. GameService를 상속받는 Proxy 클래스를 만든다.

```java
public class GameServiceProxy extends GameService {
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("Game Start Time : " + (System.currentTimeMillis() - before));
    }
}

```

```java
public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
```

# 선생님 진행방식 2 - 인터페이스를 쓸 수만 있다면
1. `GameService` 인터페이스를 만든다.
   - 인터페이스를 만드는 것이 상속보다 테스트 코드 짜는데 유연하다.
2. `GameServiceImpl` 클래스를 만든다.
   - `GameService` 인터페이스를 구현한다.  

# 자바에서 사용되는 프록시 패턴
자바의 인스턴스를 런타임에 만들 수 있는 방법을 제공하는데, 이를 다이나믹 프록시라고 한다.
- java reflection

# 스프링에서 사용되는 프록시 패턴
- 스프링 AOP는 프록시 패턴을 기반으로 한다.
### 스프링의 AOP
- 스프링이 관리하는 bean에 대해서만 AOP를 적용할 수 있다.