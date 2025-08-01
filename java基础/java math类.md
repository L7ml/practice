Math 类是 Java 提供的数学工具类，位于 java.lang 包中，包含执行基本数值运算的静态方法。
Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用
```java
public class Test {  
    public static void main (String []args)  
    {  
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
    }  
}
```
### 高级数学运算

#### 1. 指数对数运算
```java
Math.exp(1);    // e^1 ≈ 2.718
Math.log(Math.E); // ln(e) = 1
Math.log10(100); // log10(100) = 2
```
#### 2. 随机数生成
```java
// 生成[0.0, 1.0)之间的随机数  
double random = Math.random();  
  
// 生成[1, 100]的随机整数  
int randomInt = (int)(Math.random() * 100) + 1;
```
#### 3. 其他运算
```java
Math.hypot(3, 4); // 计算sqrt(x²+y²) → 5.0  
Math.IEEEremainder(10, 3); // IEEE余数 → 1.0
```
#### 4. 常量字段
```java
Math.PI;    // π ≈ 3.141592653589793  
Math.E;     // 自然对数底数e ≈ 2.718281828459045
```