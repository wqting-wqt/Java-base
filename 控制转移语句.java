package 基础知识语句;

public class 控制转移语句 {
    public static void main(String[] args){
        //break
       /* for(int i=0;i<10;i++){
            if(i==5)
                break;
            System.out.println("i="+i);
        }
        */
        //continue
        for(int i=0;i<10;i++){
            if(i==5)
                continue;
            System.out.println("i="+i);
        }
    }
}
