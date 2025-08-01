api:

|       |                                                                                                                                                                                                                                                                                                                                                                      |     |     |      |             |
| ----- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --- | --- | ---- | ----------- |
| 传统日期  | [Date](https://www.runoob.com/java/java-date-class.html), [Calendar](https://www.runoob.com/java/java-calendar-class.html)，[GregorianCalendar](https://www.runoob.com/java/java-gregoriancalendar-class.html)                                                                                                                                                        | 否   | 可变  | 1.0+ | 设计缺陷多，不推荐使用 |
| 新日期时间 | [LocalDate](https://www.runoob.com/java/java-localdate-class.html), [LocalTime](https://www.runoob.com/java/java-localtime-class.html), [LocalDateTime](https://www.runoob.com/java/java-localdatetime-class.html), [ZonedDateTime](https://www.runoob.com/java/java-zoneddatetime-class.html), [ChronoUnit](https://www.runoob.com/java/java-chronounit-class.html) | 是   | 不可变 | 8+   | 设计良好，推荐使用   |
| 时间戳   | [Instant](https://www.runoob.com/java/java-instant-class.html)                                                                                                                                                                                                                                                                                                       | 是   | 不可变 | 8+   | 机器时间，精确到纳秒  |
| 格式化   | [DateTimeFormatter](https://www.runoob.com/java/java-datetimeformatter-class.html)                                                                                                                                                                                                                                                                                   | 是   | 不可变 | 8+   | 线程安全的格式化类   |

程序:
```java
import java.time.LocalDate;

public class 时间{
    public static void main(String args[]){
        LocalDate today=LocalDate.now();
        System.out.println(" " + today);
        LocalDate nationalDay=LocalDate.of(2025,10,1);
        System.out.println(" " + nationalDay);
        LocalDate tomorrow=today.plusDays(1);
        LocalDate nextmonth=today.plusMonths(1);
        LocalDate nextyear=today.plusYears(1);
        System.out.println(" " + tomorrow);
        System.out.println(" " + nextmonth);
        System.out.println(" " + nextyear);

    }

}
```