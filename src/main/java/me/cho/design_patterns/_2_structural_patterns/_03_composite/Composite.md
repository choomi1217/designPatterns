# 전체나 부분이나 동일한 컴포넌트로 인식 할 수 있는 계층 구조를 만든다.

![컴포짓 패턴 클래스 다이어그램](./composite.drawio.png)

```java

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
    private void printPrice(Bag bag){
        int sum = bag.itemList.stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }
}


```

# 무엇이 문제일까?
Bag 안에 들어있는 전체 아이템의 가격도 보고싶고 단일 아이템의 가격도 보고싶다.
그래서 **printPrice** 라는 메소드를 만들었는데 **같은 기능을 하지만 파라미터 타입이 달라서 메소드를 두개 만들어야 하는 상황.**

* 만약 캐릭터가 가방을 2개 들고 있다..?
* 가방 안에 가방이 들어있다..?
* 캐릭터가 가방 없이 아이템만 들고 있다..?
만약의 경우에 어떻게 될지 참 막막함

# 선생님의 진행 방식
## Composite 이 Bag 이고 Composite은 절대 Leaf인 Item 을 참조하면 안됨, Component만을 참조 해야함
1. Item 은 Component를 implement 하고 override로 getPrice()를 구현함
2. Bag이 참조하던 Item을 Component로 바꿈
3. Bag 또한 마찬가지로 Component 를 implement 하고 override 함
4. Client의 printPrice()를 바꾸며 가능한 추상화 된 객체 타입을 사용하는 습관을 들이라고 함.
   * 아래처럼 printPrice의 인자로 Item 이나 Bag을 직접 넣어 2개씩 구현하는게 아니라 Component로 인자를 주고 하나만 구현하면 됨 
   * 대부분의 경우 정확한 타입의 변수보다 추상화된 타입의 클래스를 사용하는 것이 좋은 습관이다. (때에 따라 다를 순 있음)
   
```java
private void printPrice(Component component) {
    System.out.println(component.getPrice() );
}
```

# 장점
# 단점
- 컴포짓패턴에 너무 끼워맞추려다 보니 오히려 로직이 더 생기는 경우도 있다.
  * printPrice(Component component)의 메소드 안에서 component의 타입이 Bag인지 Item인지 확인하는 등
  * 그럴땐 본인이 디자인패턴에 종속적인 코드를 짜고 있는것이 아닌지 의심 

# 사용되는 예제
- Java Swing

```java
public Component add(Component comp) {
   addImpl(comp, null, -1);
   return comp;
}
```

```java
public class SwingExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000,1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200,200,200,40);
        jFrame.add(jTextField);

        JButton jButton = new JButton();
        jButton.setBounds(200,200,200,40);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("Hi There");
            }
        });
        jFrame.add(jButton);

    }
}

```
