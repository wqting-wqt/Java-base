package 基础知识语句;
import java.util.Scanner;

/*
switch语句
          格式：
          switch（表达式）{
             case 数值1：
             语句体1；
             break；
             case 数值2：
             语句体2；
             break；
             case 数值3：
             语句体3；
             break；
             ······
             default：
             语句体n+1；
             [break;]
           }
        格式说明：
             表达式：取值byte、short、int、char、JDK5以后可以是枚举，JDK7以后可以是String
             case：后面跟的是要和表达是比较的值
             break：表示中断，结束的意思，用于switch语句
             default：表示所有内容都不匹配的时候，执行该处的信息，类似·if···else的else
 */
public class switch格式02 {
    public static void main(String[] args) {
        System.out.println("starting");
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个星期数：");
        int week =sc.nextInt();
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("你输入的星期书有误");
        }
        System.out.println("ending");
    }

}
