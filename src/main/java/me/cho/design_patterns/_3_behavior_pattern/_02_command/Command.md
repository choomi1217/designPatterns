# 커맨드 패턴
> 도구와 사용자 사이의 느슨한 결합을 위해 요청을 캡슐화 하는 패턴

```java
//Button
public class Button {

    private final Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void pressed() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
    }

}

//Light
public class Light {

    private boolean on;

    public void on(){
        on = true;
        System.out.println("Light on");
    }

    public void off(){
        on = false;
        System.out.println("Light off");
    }

}

//MyApp
public class MyApp {
    private Game game;
  
    public MyApp(Game game) {
      this.game = game;
    }
  
    public void pressed() {
      game.start();
    }
  
    public static void main(String[] args) {
      MyApp app = new MyApp(new Game());
      app.pressed();
      app.pressed();
      app.pressed();
      app.pressed();
    }
}

```

# 무엇이 문제인가?
- `Button`과 `MyApp`에 비슷한 코드가 복붙 되었다.
- 만약 Light의 `on`, `off`가 `turnOn`, `turnOff`가 된다면?
  - `Button`과 `MyApp`의 모든 `on`, `off`를 `turnOn`, `turnOff`로 변경해야 한다.
- `Light` 가 `Game`이 된다면?
- 변경이 어렵다.이게 모두 invoker와 receiver가 강하게 결합되어 있기 때문에 발생하는 문제이다.

# 해결책
- `Button`과 `MyApp`의 `on`, `off`를 `Command`라는 인터페이스로 추상화 한다.
- `Command`를 구현한 `LightOnCommand`, `LightOffCommand`를 만든다.
- `Button`과 `MyApp`의 `on`, `off`를 `Command`로 변경한다.

# 장점과 단점
- 만약 Light의 `on`, `off`가 `turnOn`, `turnOff`가 되어도 Button과 MyApp의 코드를 변경할 필요가 없다. 
  - Button, MyApp 같은 클래스를  `Invoker`라고 부르고 `LightOnCommand`, `LightOffCommand` 같은 클래스를 `Receiver`라고 부른다.

