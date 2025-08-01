在Java中，this关键字用于引用方法或构造函数中的当前对象
```java
class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this引用= " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("对象引用= " + obj);
    }
}
```
## 使用this方法处理变量名的歧义性
在Java中，不允许在范围（类范围或方法范围）内声明两个或多个具有相同名称的变量。但是，实例变量和参数可能具有相同的名称。例如，
```java
class MyClass {
    // 实例变量
    int age;

    // 参数
    MyClass(int age){
        age = age;
    }
}

```
在上面的程序中，实例变量和参数具有相同的名称：age。在这里，由于名称不明确，Java编译器感到困惑。

在这种情况下，我们使用this关键字。例如，

首先，让我们看一个不使用this关键字的示例：
```java
class Main {

    int age;
    Main(int age){
        age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
```

现在，让我们使用this关键字重写上面的代码。
```java
class Main {

    int age;
    Main(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
```
另外，如果参数和实例变量的名称不同，则编译器会自动附加this关键字。例如代码：
```java
class Main {
    int age;

    Main(int i) {
        age = i;
    }
}
```
等同于：
```java
class Main {
    int age;

    Main(int i) {
        this.age = i;
    }
}
```

### this 与Getters和Setters
this关键字的另一个常见用法是在类的_setter和getter方法_中。例如：
```java
class Main {
   String name;

   // setter 方法
   void setName( String name ) {
       this.name = name;
   }

   // getter 方法
   String getName(){
       return this.name;
   }

   public static void main( String[] args ) {
       Main obj = new Main();

       // 调用setter和getter方法
       obj.setName("Seagull");
       System.out.println("obj.name: "+obj.getName());
   }
}
```

在这里，我们使用了this关键字：
- 在setter方法中分配值
    
- 在getter方法中访问值
## 在构造函数重载中使用this
在处理[构造函数重载时](https://www.cainiaojc.com/java/java-constructors.html#overloading)，我们可能必须从另一个构造函数调用一个构造函数。在这种情况下，我们不能显式调用构造函数。相反，我们必须使用this关键字。

在这里，我们使用this关键字的另一种形式。也就是this()。让我们举个实例
```java
class Complex {

    private int a, b;

    //带两个参数的构造函数
    private Complex( int i, int j ){
        this.a = i;
        this.b = j;
    }

    //具有单个参数的构造函数
    private Complex(int i){
        //用两个参数调用构造函数
        this(i, i); 
    }

    //没有参数的构造函数
    private Complex(){
        //用单个参数调用构造函数
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main( String[] args ) {
  
                //创建Complex类的对象
                //使用2个参数调用构造函数 
        Complex c1 = new Complex(2, 3); 
    
        //使用单个参数调用构造函数
        Complex c2 = new Complex(3);

        //不带参数调用构造函数
        Complex c3 = new Complex();

        //打印对象
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
```
System.out.println(c1);
在这里，当我们打印对象c1时，对象被转换成字符串。在此过程中，将调用toString()。由于我们在类中重写了toString()方法，因此我们根据该方法获得输出。
 this()的最大优点之一是减少了重复代码的数量。但是，在使用this()时，我们应该特别小心。  

 这是因为从另一个构造函数调用构造函数会增加开销，而且这是一个缓慢的过程。使用this()的另一个巨大优势是减少重复代码的数量。  

**注意**：从另一个构造函数调用一个构造函数称为显式构造函数调用。

### this作为参数传递
我们可以使用this关键字将当前对象作为参数传递给方法。例如，
```java
class ThisExample {
    // declare variables
    int x;
    int y;

    ThisExample(int x, int y) {
          //为构造函数内的变量赋值
        this.x = x;
        this.y = y;

        //调用add()前x和y的值
        System.out.println("在将this其传递给addTwo()方法之前:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        //调用add()方法，将this其作为参数传递
        add(this);

        //调用add()后x和y的值
        System.out.println("在将this其传递给addTwo()方法之后:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }
}

class Main {
    public static void main( String[] args ) {
        ThisExample obj = new ThisExample(1, -2);
    }
}
```
