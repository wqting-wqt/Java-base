package 基础知识语句;
/*
    continue：用于循环当中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行
    break：用于循环当中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整一个循环
 */
public class 跳转语句 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("**************************");
        for(int j=1;j<=5;j++){
            if(j%2==0){
                break;
            }
            System.out.println(j);
        }


    }
}
