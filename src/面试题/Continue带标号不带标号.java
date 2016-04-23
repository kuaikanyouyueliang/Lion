/**
 * Created by Administrator on 2016/4/23.
 */
public class Continue带标号不带标号 {
    /**
     * 1.不带标号，不执行continue后面的语句，开始执行下一轮循环；
     * 2.代标号，跳到标号处，执行下一轮循环；
     */
    public static void main(String[] args) {
        continueWithOutFlag();
        continueWithFlag();
    }

    private static void continueWithOutFlag(){
        int row=0;
        for (int i=0;i<100;i++){
            if (i%2==0){
                continue;
            }else {
                System.out.print(i+" ");
                row++;
                if(row%5==0){
                    System.out.println();
                }
            }
        }
    }

    private static void continueWithFlag(){
        flag:
        for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                if (j>i){
                    System.out.println();
                    continue flag;
                }else {
                    System.out.print(i*j+" ");
                }
            }
        }
    }
}
