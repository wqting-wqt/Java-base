package 基础知识语句;
    /*
     do·····while
             基本格式：
             do{
             循环体语句；
             }while（条件判断语句）；
             完整格式：
             初始化语句；
             do{
             循环体语句；
             条件控制语句；
             }while（条件判断语句）；
             执行流程：
             1.执行初始化语句
             2.执行循环体语句；
             3.执行条件控制语句
             4.执行那个条件判断语句，看其结果是true还是false
             如果是true，循环结束
             如果是false，继续执行
             5.回到2继续
             */

public class dowhile {

        public static void main(String[] args) {
            //区分for循环和while语句
            //for循环
            for(int i=1;i<=5;i++){
                System.out.println("hello!");
            }
            System.out.println("````````");
            //while语句
            int j=1;
            while(j<=5){
                System.out.println("hi!");
                j++;
            }
            System.out.println("````````");
            //do···while
            int k=1;
            do{
                System.out.println("have a good day!");
                k++;
            }while(k<=5);

      /*
        //死循环
        for(; ;){
            System.out.println("GODD WAY");
        }


         while (true){
             System.out.println("GODD WAY");
         }

         do{
             System.out.println("GODD WAY");
         }while(true);
         */
        }
}
