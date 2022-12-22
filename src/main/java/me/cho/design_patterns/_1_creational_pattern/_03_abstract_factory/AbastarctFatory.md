# 추상 팩토리 패턴

인스턴스를 만드는 걸 추상화 하는 것은 팩토리 메소드 패턴과 유사하지만
추상 팩토리 패턴은 **클라이언트 측에서 추상화된 팩토리를 사용하는 쪽에 조금 더 촛점을 맞춘 패턴**입니다.

# 무엇이 문제일까?
- 영미호에 돛의 요구사항이 바뀌어 `OomiAnchor`가 아니고 `NewOomiAnchor`가 되면 코드가 바뀌어 버린다.
  - 🛠 `new OomiAnchor` 라는 구체적인 클래스를 사용하는것이 문제 
```java
public class OomiShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {

        Ship ship = new OomiShip();
        ship.setAnchor(new OomiAnchor());
        ship.setWheel(new OomiWheel());

        return ship;
    }
}
```

# 선생님의 진행방식
1. Anchor와 Wheel을 Part로 정의하고 `ShipPartsFactory` 라는 Parts를 만드는 팩토리 클래스 생성.
2. `ShipPartsFactory`를 구현하는 `OomiShipPartsFactory` 생성후 구현.
3. `OomiShipPartsFactory`에서 사용될 `OomiAnchor` 와 `OomiWheel` 의 추상체인 `Anchor` 와 `Wheel` interface 생성.
4. `OomiAnchor` 와 `OomiWheel` 가 각각의 추상체인 `Anchor` 와 `Wheel`을 구현하도록 함.
5. 만약 `OomiAnchor`의 업그레이드 버전인 `OomiAnchorPro`가 나왔다고 치면 `OomiAnchorPro` 클래스를 또 만들어주면 됨
6. `OomiAnchorPro`와 `OomiWheelPro`, `OomiProPartsFactory`까지 총 3개의 클래스가 추가됨. 


# 팩토리메소드패턴 vs 추상팩토리패턴
> 두 패턴은 이름도 비슷하고 구현 방식도 비슷한데 다른 점이라면 보는 관점입니다.
> 객체를 만드는 과정을 추상화 한 두 패턴

## 팩토리 메소드 패턴
- 팩토리를 만드는 과정에 조금 더 집중했습니다.
- 인스턴스(concrete)를 만드는 과정을 팩토리로 숨기고 팩토리를 제공합니다.
- **객체 생산 과정을 하위 클래스로 옮기는 것이 목적**입니다. 

## 추상 팩토리 패턴
- 팩토리를 통해서만 클라이언트가 쓸 수 있기 때문에 클라이언트는 하위 클래스를 직접 사용 할 일이 없습니다.
- 즉, 하위 클래스에 의존하지 않고 **팩토리를 통해 인스턴스를 클라이언트에 제공 해주는 것이 목적**입니다.




# 실무에서는?
- DocumentBuilderFactory 가 추상 팩토리로 구현되어 있습니다.
- springframework.beans.factory.FactoryBean
  - 스프링에서 만들어놓은 팩토리 메소드 패턴입니다.
  - 구현 할 때는 getObject와 getClass가 기본 구현입니다.
  - 해당 클래스 구현시 스프링 컨텍스트로 사용 가능한 객체가 됩니다.
