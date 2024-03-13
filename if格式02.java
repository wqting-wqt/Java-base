package 基础知识语句;
/*
格式：
    if（关系表达式）{
    语句体1；
    }
    else{
    语句体2；
    }
        执行流程：
        1.计算关系表达式的值
        2.如果关系表达式的值为true，执行语句1
        3.如果关系表达式的值为false，执行语句2
        4. 继续执行语句后面的语句内容
 */
public class if格式02 {
    public static void main(String[] args){
        System.out.println("starting");
        //定义两个变量
        int a=10,b=12;
        // int b=20;
        // b=5;
        //判断a是否大于b，大于则在控制台输出a>b,小于则在控制台输出a<b
        if(a>b){
            System.out.println("a>b");
        }
        else{
            System.out.println("a<b");
        }
        System.out.println("ending");
    }
}
