Varargs是变量参数的缩写。 在Java中，方法的参数可以接受任意数量的值。 可以接受可变数量的值的该参数称为varargs。
```java
accessModifier methodName(datatype… arg) {
    // 方法主体
}
```
为了定义vararg，在方法的形参中使用……(三个点)。  

接受可变数量参数的方法称为可变数量方法，或简称为varargs方法
首先，让我们看一下不使用varargs的示例：
```java
class NoVararg {

    public int sumNumber(int a, int b){
        return a+b;
    }

    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }

    public static void main( String[] args ) {
        NoVararg obj = new NoVararg();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));
    }
}
```
必须重载sumNumber()方法才能使其适用于3个参数。
如果用户要添加5个数字或10或100，该怎么办？
使用varargs可以以一种简洁的方式处理这一问题。让我们看一个代码示例：
### 示例：可变参数的工作演示
```java
class VarargExample {

    public int sumNumber(int ... args){
        System.out.println("参数长度: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        VarargExample ex = new VarargExample();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}
```
在这里，sumNumber()方法返回传递给它的int参数的总和（与传递的参数数量无关）

### format()方法
类似于c中的printf
```java
  
public class Main{  
  
    public static void main(String [] args){  
       int a=0;  
       char b='b';  
       String c="hello world";  
       System.out.println(  
               String.format("%d,%c,%s",a,b,c)  
       );  
    }  
}
```

## 使用 Varargs 时要记住的事情

这是使用Java Varargs时应记住的几件事：
**1.在定义方法签名时，请务必**保留最后varargs。
变量参数必须是传递给方法的最后一个参数。

```java
doSomething(1, 2, 3, 4);
//错误的方法声明
public void doSomething(int ... nums, int p){
    // method body
}

```
在这种情况下，编译器无法确定传递给nums的参数数量。
但是，如果将方法定义为：
```java
public void doSomething(int p, int ... nums) {
    // method body
}
```
Java编译器将第一个参数分配给 p，其余int参数分配给 nums。

2.一种方法只能有一个varargs参数。
例如，此方法声明不正确：
```java
int doSomething(int p, float ... floatNums, double ... doubleNums) {
    // code
}
```