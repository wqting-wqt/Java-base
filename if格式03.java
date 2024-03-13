package 基础知识语句;
import java.util.Scanner;

/*
格式：
    if（关系表达式1）{
    语句体1；
    }
    else if （关系表达式2）
    {
    语句体2；
    }
    ·······
    else{
    语句体n+1
    }
        执行流程：
        1.计算关系表达式1的值
        2.如果关系表达式的值为true，执行语句1，如果关系表达式的值为false，执行语句2
        3.如果关系表达式的值为true，执行语句2，如果关系表达式的值为false，执行语句3
        ···············
        4. 如果没有任何·关系表达式是true，执行语句体n+1
 */

public class if格式03 {
    public static void main(String[] args) {
        System.out.println("starting");
        //
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个星期数：");
        int week =sc.nextInt();
        if(week==1){
            System.out.println("Monday");
        }
        else if(week==2){
            System.out.println("Tuesday");
        }
        else if(week==3){
            System.out.println("Wednesday");
        }
        else if(week==4){
            System.out.println("Thursday");
        }
        else if(week==5){
            System.out.println("Friday");
        }
        else if(week==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }
        System.out.println("ending");
    }
}
