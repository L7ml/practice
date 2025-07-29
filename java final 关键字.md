在Java中，final关键字用于表示常量。它可以与变量，方法和类一起使用。

任何实体（变量，方法或类）一旦被声明final后，只能分配一次。也就是，

- final变量不能用另一个值重新初始化
    
- final方法不能被重写
    
- final类不能被继承

## 1. Java final变量

在Java中，我们无法更改final变量的值。例如
```java
class Main {
  public static void main(String[] args) {

    //创建一个final变量
    final int AGE = 32;

    //尝试更改final变量
    AGE = 45;
    System.out.println("Age: " + AGE);
  }
}
```
在上述程序中，我们创建了一个名为age的final变量。并且我们尝试更改final变量的值。

运行程序时，将出现以下错误消息，提示编译错误。

## 2. Java final方法
在Java中，该final方法不能被子类覆盖。例如
```JAVA
class FinalDemo {
    //创建final方法
    public final void display() {
      System.out.println("这是Final方法。");
    }
}

class Main extends FinalDemo {
  //尝试重写final方法
  public final void display() {
    System.out.println("Final方法被覆盖。");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}
```
在上面的示例中，我们创建了一个在FinalDemo类内部命名display()的final方法。在这里，Main类继承了FinalDemo类。

我们试图覆盖Main该类中的final方法。运行程序时，将出现以下错误消息，提示编译错误

## 3. Java final类
在Java中，final类不能被另一个类继承。例如
```JAVA
final class FinalClass {
    //创建final方法
    public void display() {
      System.out.println("这是final方法。");
    }
}

class Main extends FinalClass {
  //尝试重写final方法
  public  void display() {
    System.out.println("重写final方法");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}
```
在上面的示例中，我们创建了一个名为FinalClass的final类。在这里，我们试图通过Main类继承final类。

运行程序时，将出现以下错误消息，提示编译错误。