# 팩토리 메소드 패턴
### 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.

- 다양한 구현체가 있고 그 중에서 특정한 구현체를 만들 수 있는 다양한 팩토리를 제공

# 팩토리 메소드 Before
- 배의 속성이 변경될 때마다 Ship 클래스가 바뀝니다.. **( = 변경에 닫혀있지 않다 )**
- OpenClosed Principle
  - 확장에는 열려있고 변경에는 닫혀있어야 한다는 객체지향 원칙.
  - 요구사항에 따라 기존 코드가 계속 변경이 되는 것 = 변경에 닫혀있지 않다.
  - 요구사항에 따라 기존 코드는 그대로되 확장 해나가는 것 = 확장에 열려있다.

# Before가 변경되어야 할 부분
```text
1. 배에 새로운 기능이 추가 된다. ( Ship )
2. 배를 만드는 공정이 변경 된다. ( ShipFactory )
```
- 이런 요구사항들이 새로 생길때 기존 코드를 건드리지 않고 확장을 해봅시다!!

# 👨‍🏫 선생님의 진행방식
1. 깜지배와 영미배를 만드는 로직이 들어간 ShipFactory에서 변경이 될 부분을 생각하고 있는다.
2. 팩토리 패턴은 인터페이스로 만들기 때문에 우선 ShipFactoru를 OomiFactoru 클래스로 변경하고 ShipFactory 인터페이스를 하나 더 만든다. 
3. 인터페이스에 기존 클래스에서 하던 로직을 옮긴다. **✨✨✨(다만 생성하는 부분 제외)✨✨✨**
4. 배를 생성하는 부분은 Override 할 수 있도록 합니다.
5. OomiFactory가 인터페이스를 상속합니다.
6. OomiShip을 하나 더 만들고 생성자에 setter를 전부 채움.
7. OomiFactory의 생성 부분엔 new OomiShip하고 끝.
8. GgamjiShip 추가, GgamjiFactory 추가
9. 배가 하나 더 추가 됐음에도 코드 변경사항 없이 클래스만 추가해주면 됨.

![팩토리 메소드 다이어그램](https://github.com/choomi1217/designPatterns/tree/master/diagrams/FactoryMethod.png)

> 🤔 하지만 AfterClient에 깜지 배를 만드는 로직이 추가되지 않았는가?

### Java8을 쓴다면
Interface 내부에 private 메소드 사용이 불가능 하므로
ShipFactory의 private 메소드를 전부 추상화하고 해당 메소드를 구현하는 `DefaultShipFactory`를 하나 더 생성하고 이걸 상속 받아서 사용합니다.
![팩토리 메소드 다이어그램](https://github.com/choomi1217/designPatterns/tree/master/diagrams/FactoryMethod_ifJava8.png)


### Factory Method 정리
- 장점
  - 코드를 변경하지 않고 확장 할 수 있다.
  - 인스턴스를 만드는 팩토리와 인스턴트인 프로덕트 간의 결합이 약하다.
- 단점
  - 클래스가 많아집니다.
- 확장에 열려있고 변경에 닫혀있는 객체 지향 원칙
  - Open Principle
  - 이미 구현된 기능에 추가 요구사항이 있을시 기존 코드의 변경을 하지 않고 클래스를 추가함으로 기능을 확장 할 수 있습니다.
- 자바 8에 추가된 default 메소드에 대해 설명하시오.
  - interface에  기본 구현 메소드를 정의 할 수 있다.
  - interface를 구현하는 하위 클래스도 인터페이스가 구현한 기본 구현 메소드를 사용 할 수 있습니다.

### Factory Method 어디서 사용되는가

- Simple Factory Method
  - 아래 코드 처럼 if문으로 분기해서 인스턴스를 생성해주는 걸 Simple Factory Method라고 합니다.
```java
public Object createProduct(String name){
    if(name.equalsIgnoreCase("oomi")){
        return new OomiShip();
    }else if (name.equalsIgnoreCase("ggamji")) {
        return new GgamjiShip();
    }
    throw new IllegalArgumentException();
}
```
  - Simple Factory Method는 `java.util.Calendar` 에서도 많이 사용합니다.
  - Spring framework에서 제공하는 BeanFactory도 일종의 Factory Method 패턴입니다.








