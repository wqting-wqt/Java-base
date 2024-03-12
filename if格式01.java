package 基础知识语句;
/*
    执行流程：
        1.计算关系表达式的值
        2.如果关系表达式的值为true，执行语句
        3.如果关系表达式的值为false，不执行语句
        4.继续执行语句后面的语句内容
 */
public class if格式01 {
    public static void main(String[] args){
        System.out.println("starting");
        //定义两个变量
        int a=10;
        int b=20;
        //判断a与b的值是否相等，相等就在控制台输出a=b
        if(a==b){
            System.out.println("a=b");
        }
        int c=20;
        //判断b、c的值是否相等，相等就在控制台输出a=b
        if(b==c){
            System.out.println("b=c");
        }
        System.out.println("ending");
    }
}
