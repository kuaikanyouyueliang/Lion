/**
 * User:Administrator
 * Date:2016/4/19 20:58
 */
public class 产生随机数并用ifelse控制 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            printMethod((int) (Math.random()*100));
        }
    }

    public static void printMethod(int num){
        if(num<60){
            System.out.println(num+":不合格要继续努力！");
        }else if (num>=60&&num<80){
            System.out.println(num+":合格，但不是优秀！");
        }else {
            System.out.println(num+":非常棒，很优秀！");
        }
    }
}
