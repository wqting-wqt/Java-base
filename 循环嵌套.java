package 基础知识语句;
/*
   循环嵌套：
        循环语句包含循环语句
     需求：
         在控制台输出一天的小时和分钟
         小时：0-24
         分钟：0-60
 */
public class 循环嵌套 {
    public static void main(String[] args) {
        for (int hour=0;hour<24;hour++){
            for(int minute=0;minute<60;minute++){
                System.out.println(hour+"时"+minute+"分");
            }
            System.out.println("-----------------");
        }
    }
}

