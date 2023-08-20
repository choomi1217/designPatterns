# 인터프리터(Interpreter) 패턴
> 반복되는 문제 패턴을 언어로 정의

- `123+-` +-연산이 너무 빈번해서 이를 `xyz+-` 이런 패턴의 언어를 정의해서 사용하고 싶다.

![](/Users/yonghee/dev/designPattern/diagrams/Interpreter.drawio.png)

```java
public static void main(String[] args) {
    PostfixNotation postfixNotation = new PostfixNotation("123+-");
    postfixNotation.calculate();
}
```
