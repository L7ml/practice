在Java中，如果两个或多个[方法的](https://www.cainiaojc.com/java/java-methods.html "Java方法")参数不同（不同数量的参数，不同类型的参数或两者都不同），则它们可以具有相同的名称。这些方法称为重载方法，此功能称为方法重载。例如：

```java
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
```
在这里，func()方法是重载的。这些方法具有相同的名称，但是接受不同的参数。

## 如何在Java中执行方法重载？
### 1.通过更改参数数量来重载
```java
class MethodOverloading {
    private static void display(int a){
        System.out.println("参数: " + a);
    }

    private static void display(int a, int b){
        System.out.println("参数: " + a + " 和 " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
```
### 2.通过更改参数的数据类型
```java
class MethodOverloading {

    //此方法接受int
    private static void display(int a){
        System.out.println("得到了整数数据.");
    }

    //此方法接受String对象
    private static void display(String a){
        System.out.println("得到了String对象。");
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}
```