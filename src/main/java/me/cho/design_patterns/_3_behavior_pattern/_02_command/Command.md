# 커맨드 패턴
> 도구와 사용자 사이의 느슨한 결합을 위한 패턴

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
    private final Light light;

    public MyApp(Light light) {
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

```

# 무엇이 문제인가?
- `Button`과 `MyApp`에 같은 코드가 복붙 되었다.
- 만약 Light의 `on`, `off`가 `turnOn`, `turnOff`가 된다면?
  - `Button`과 `MyApp`의 모든 `on`, `off`를 `turnOn`, `turnOff`로 변경해야 한다.
- `Light` 가 `Game`이 된다면?
- 이게 모두 invoker와 receiver가 강하게 결합되어 있기 때문에 발생하는 문제이다.