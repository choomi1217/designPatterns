# 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
# 추상화를 분리하여 둘이 독립적으로 변경될 수 있도록 하는 것입니다.

![BridgePatten](..\diagrams\Bridge.png)

클라이언트는 Implementation을 간접적으로만 사용하고 진짜 사용되는 부분은 Abstraction이다.
Abstraction은 추상적인 로직을 담은 클래스입니다.
Implementation은 구체적인 로직을 담은 클래스입니다.

# 무엇이 문제일까?
Kda 아리를 개발하고 나서 보니 PoolParty 아리도 똑같은 로직을 복붙해서 PoolParty라는 단어로만 바꿔준 것 뿐이다.

# 선생님의 진행방식
1. Champion을 상속받는 DefaultChampion을 생성
2. Skin 생성
3. 아리와 아칼리 챔피언 생성
4. KDA와 PoolParty 스킨 생성
5. App main으로 아리를 생성하고 skin을 부여

Abstraction 계층 구조에 해당하는 챔피언이 Implementation Detail에 해당하는 Skin을 사용
각각의 skin들이 Concrete Implementation
각각의 챔피언들이 RefinedAbstraction 입니다. 

# 장점
- 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있음
  - 
# 단점

# 사용 되어지는 곳

1. jdbc
2. slf4j
   - log4j 같은 구현체로 log를 남기면 클라이언트도 log4j를 써야 해서 slf4j를 사용함
3. MailSender
4. PlatformTransactionManager
