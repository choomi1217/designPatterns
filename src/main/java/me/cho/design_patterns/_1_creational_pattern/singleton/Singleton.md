# 싱글톤(Singleton)  패턴
### 인스턴스를 오직 한개만 제공하는 클래스

- 시스템 런타임, 환경 셋팅에 대한 정보 등, 인스턴스가 여러개일 때 문제가 생길 수 있는 경우가 있다. 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.

#### 목적
- 하나의 인스턴스만 제공한다.
- 제공된 하나의 인스턴스에 글로벌하게 접근한다.

# Singleton1

## 1. 싱글톤이 아닌걸로 구현
- App.java
- Setting.java

```java
package singleton.singleton1;

import _1.singleton.singleton1.Setting;

public class App {

  public static void main(String[] args) {
    Setting setting = new Setting();
  }
}
```

> 위처럼 main 클래스에서 new를 통해 몇번이고 Setting 객체를 생성 할 수 있습니다.

```java
package singleton.singleton1;

import _1.singleton.singleton1.Setting;

public class App {

  public static void main(String[] args) {
    Setting setting = new Setting();
    Setting setting2 = new Setting();
    System.out.println(setting != setting2);
  }

}
```

> 또한 그렇게 만들어진 다수개의 객체는 서로 다른 객체입니다.

### 싱글톤 패턴을 구현하기 위해선 new 키워드의 사용을 막아야 합니다.

# 싱글톤으로 구현

## 🔎 간단한 방법
1. 생성자를 통해 구현하지 못하도록 생성자를 private로 막습니다.
2. public static 메소드를 통해 생성된 static 인스턴스를 반환합니다.

#### 1. 생성자 막기
```java
public class Setting {
    private Setting() {}
}
```

#### 2. publi static 메소드로 인스턴스 제공

```java
package singleton.singleton1;

public class Setting {

    private static Setting instance;

    private Setting() {
    }

    public static Setting getInstance() {
        if (instance == null) {
            instance = new Setting();
        }
        return instance;
    }

}
```

> 이 방법은 thread에 safe하지 않습니다.
> 여러개의 스레드가 동시 실행중이라면 각각의 스레드에서 각각의 인스턴스를 생성하게 됩니다.
> 
> thread safe한 방법으로 구현.

# 🔎 thread safe한 방법

### 1. synchronized
```java
public static synchronized Setting getInstance(){
    if(instance == null){
        instance = new Setting();
    }
    return instance;
}
```

> 동기화 하면 getInstance 메소드 실행 할 때마다 동기화 작업이 필요하므로 성능에 이슈가 있을 수 있습니다.

### 2. 이른 초기화 (eager initialization)

```java
package singleton.singleton1;

public class Setting {

    private static final Setting INSTANCE = new Setting();

    private Setting() {
    }

    public static Setting getInstance() {
        return INSTANCE;
    }

}
```

> 이른 초기화이므로 인스턴스를 미리 만드는 과정이 무거운 클래스라면 단점이 될 수 있습니다.

### 3. Double Checked Locking

```java
package singleton.singleton1;

public class Setting {

    private static Setting instance;

    private Setting() {
    }

    public static Setting getInstance() {
        if (instance == null) {
            synchronized (Setting.class) {
                if (instance == null) {
                    instance = new Setting();
                }
            }
        }
        return instance;
    }

}
```

> volatile에 대한 이해가 필요하며 코드가 복잡하고 1.5 이하 jdk에서는 작동하지 않습니다.

### 4. static inner 👍

```java
package singleton.singleton1;

public class Setting {

    private Setting() {
    }

    private static class SettingHolder {

        private static final Setting INSTANCE = new Setting();
    }

    public static Setting getInstance() {
        return SettingHolder.INSTANCE;
    }

}
```
> 멀티스레드 환경에서도 세이프하면서 getInstance 호출시 인스턴스를 반환해주는 Lazy loading이기 때문에 메모리 낭비도 없으며
> double checked blocking 처럼 복잡하지도 않은 코드입니다.

# 🔎 싱글톤 패턴 깨부시기

### 1. Reflection
- reflection 사용법

```java
package singleton.singleton1;

import _1.singleton.singleton1.Setting;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

  public static void main(String[] args)
          throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Setting setting1 = Setting.getInstance();

    Constructor<Setting> constructor = Setting.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Setting setting2 = constructor.newInstance();

    System.out.println(setting1 == setting2);
  }

}
```
```
false
```

### 2. 직렬화와 역직렬화
- 직렬화와 역직렬화 사용법

```java
package singleton.singleton1;

import _1.singleton.singleton1.Setting;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Setting setting1 = Setting.getInstance();
    Setting setting2 = null;

    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(setting1);
    }

    try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      setting2 = (Setting) input.readObject();
    }

    System.out.println(setting1 == setting2);
  }
}
```
```
false
```
- 직렬화와 역직렬화 방어법
  - 역직렬화시 사용되는 readResolve 에서 getInstance를 사용하면 됩니다.
```java
public class Setting implements Serializable {

    private Setting() {}

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();
    }
    public static Setting getInstance(){
        return SettingHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }

}
```

# 싱글톤 패턴 실무
- Spring 의 bean container
- Runtime : java 애플리케이션이 실행 되고 있는 환경에 대한 것
```java
Runtime runtime = Runtime.getRuntime();
```
- 다른 디자인 패턴 구현체의 일부로 쓰이기도 함
