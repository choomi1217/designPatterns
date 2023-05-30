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
- 인터페이스를 쓸 수만 있다면 **GameService 를 인터페이스로 만드는게 최고**
  

# 선생님 진행방식 1 - 상속을 쓸 수밖에 없는 경우
1. GameService를 상속받는 Proxy 클래스를 만든다.
2. 단순하게 부모 메소드를 호출 전 후로 시간을 측정한다.

```java
// GameServiceProxy 
public class GameServiceProxy extends GameService {
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("Game Start Time : " + (System.currentTimeMillis() - before));
    }
}
// Client
public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
```

# 선생님 진행방식 2 - 인터페이스를 쓸 수만 있다면
1. `GameService`를 인터페이스 만든다.
   - 인터페이스를 만드는 것이 상속보다 테스트 코드 짜는데 유연하다.
2. `DefaultGameService` 클래스를 만든다.
   - `GameService` 인터페이스를 구현한다.
3. `GameServiceProxy` 클래스를 만든다.
   - `GameService` 인터페이스를 구현함과 동시에 GameService 의존성을 부여 받는다.
   - 만약 의존성 부여 받은게 없으면 `DefaultGameService`로 스스로 의존성 부여.

# 장점
- 기존의 코드를 변경하지 않으면서 기능을 추가했음.
  - `gameService.startGame();` 변경되지 않음.
  - 변경되지 않으면서 기능도 추가함
  - 이는 Open–closed principle에 해당
- 만약 `DefaultGameService` 자체가 생성 비용이 너무 비싸다면 객체를 만드는 걸 지연시킬 수 있다.
  - Jpa의 지연로딩이 프록시 기반으로 만들어 
# 단점
- 코드의 복잡성 증가

# Proxy가 사용되는 예제
- Reflection - 다이나믹 프록시
  - GameServiceProxy는 GameService를 implement 한다던가 하는 식으로 컴파일-타임에 사용 할 수 있게끔 만들었는데 자바에서 프록시 인스턴스를 런-타임에 사용 할 수 있게끔 만든 예제가 있음
  - 런-타임 관련된 객체를 **다이나믹** 하다 라고 표현하는데 자바엔 다이나믹 프록시가 있음
  - 애플리케이션의 동작 도중 자바의 객체를 동적으로 만들 수 있는 리플렉션이랑 기능으로 제공
```java
private GameService getGameservice(GameService targer){
    return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
            new Class[]{GameService.class}, ((proxy, method, args) -> {
                System.out.println(" Hello, Dynamic Proxy! ");
                method.invoke(targer,args);
                return null;
        })
    );
}
```