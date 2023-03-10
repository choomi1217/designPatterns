# Builder
인스턴스의 생산 과정이 다양한 절차를 통해서 만들어진다면
해당 절차를 공장처럼, 계획적인 절차를 따라서 만들 수 있게끔 합니다.

# 무엇이 문제일까?
- 계획적인 절차를 따라 인스턴스가 만들어져야 하는데 중간중간 절차가 빠진 불완전한 인스턴스가 생성되는 것이 문제입니다.
- 가령 `아침에 일어나 밥 먹고 세수하고 양치하고 출근` 이어야 하는데 `밥먹고 출근` 이런 요상한 인스턴스.
- 또한, 생성자에 해당 절차들을 파라미터로 다 넣자 하니 너무 알아보기 힘들어집니다.

# 선생님 진행방식
1. TourPlanBuilder 인터페이스에 메소드 체이닝을 만듦.
2. main에서 메소드 체이닝을 통해 직접 Tour를 만들어 봄.
3. 만약 해당 메소드 체이닝에 똑같은 값이 들어가는게 계속해서 반복 된다면 (일본여행 상품을 판매하는 투어상품의 경우) Director 클래스를 통해 해결.
4. TourDirector 클래스를 생성하고 지금까지 main에서 만들었던 Tour를 해당 클래스의 `xxxTour`란 메소드로 만듦.
5. main에서 직접 만들던 Tour를 Director를 통해서 만들게 됨.


# 장점과 단점
- 장점
  - 생성 과정이 복잡한 인스턴스 생성 로직을 모든곳에서 동일하게 사용 할 수 있게 함
  - Director 클래스를 이용해서 인스턴스의 생성 과정을 숨길 수 있음. (겉으로 깨끗해보임)
  - 불완전한 객체 생성을 막을 수 있음. (ex. getPlan();)
- 단점
  - Director + Builder 인스턴스가 필수로 필요함.
  - 디자인 패턴의 공통적인 단점으로 클래스가 많고 복잡해짐.

# 실제 사용 사례
- StringBuilder ( Synchronized x )
- StringBuffer ( Synchronized o )
- Stream
- Lombok

![빌더 패턴 다이어그램](https://github.com/choomi1217/designPatterns/tree/master/diagrams/Builder.png)
