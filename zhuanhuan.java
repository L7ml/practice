//题目要求将输入摄氏度转换成华摄氏度(保留1位小数),并输出
import java.util.Scanner;
public  class zhuanhuan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double f=c*9/5+32;
        System.out.printf("%.1f",f);
    }
}
