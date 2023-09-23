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

after 코드를 디버깅 했을시 스택에 아래와 같이 `PostfixExprssion`이 쌓이는 것을 확인할 수 있습니다.
이런 형태를 `Abstract Syntax Tree`라고 합니다.
![../img.png]()

- `_02_after`는 interface를 구현한 class를 사용해서 구현했습니다.
- `_03_after`는 interface에 static method를 사용해서 구현했습니다.
  - 그중에서도 첫번째는 익명클래스를 사용해서 구현했습니다.
  - 두번째는 람다식을 사용해서 구현했습니다.
  - 클래스를 직접 구현한 `_02`와 비교해서 코드를 이해하긴 힘들지만 클래스가 조금 덜 늘어납니다.
```java
public interface PostfixExpression {
    int interpret(Map<Character, Integer> variables);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return new PostfixExpression() {
            @Override
            public int interpret(Map<Character, Integer> variables) {
                return left.interpret(variables) + right.interpret(variables);
            }
        };
    }
    
    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return new PostfixExpression() {
            @Override
            public int interpret(Map<Character, Integer> variables) {
                return left.interpret(variables) - right.interpret(variables);
            }
        };
    }

    static PostfixExpression variable(char variable) {
        return new PostfixExpression() {
            @Override
            public int interpret(Map<Character, Integer> variables) {
                return variables.get(variable);
            }
        };
    }
}
```

```java
public interface PostfixExpression {
    int interpret(Map<Character, Integer> variables);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }
    
    
    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }
    
    static PostfixExpression variable(char variable) {
        return context -> context.get(variable);
    }
}
```

# 장점과 단점
- 자주 사용되는 패턴을 정의해서 사용할 수 있습니다.
- 패턴을 확장하는데 용이합니다.
- 코드가 복잡합니다. 패턴으로 정의하는데 드는 노력을 고려해야합니다.

# 참고
### 자바에서 Interpreter 패턴을 사용하는 곳
- 정규표현식을 판별할 때 사용됩니다. `java.util.regex.Pattern`

### 스프링에서 Interpreter 패턴을 사용하는 곳
- 스프링에서는 `SpEL`이라는 표현식 언어를 제공합니다.
- 