/**
 * User:Administrator
 * Date:2016/4/20 20:21
 */
public class 求3和100之间所有的素数 {
    public static void main(String[] args) {
        int x=0;
        for (int i = 3; i <= 100; i++) {
            int n = (int) Math.sqrt(i);//i的开方
            boolean flag = true;//true是素数
            for (int j = 2; j <= n; j++) {//i能否被2~n之间的数整除
                if (i % j == 0)//i除以2~n之间的数，看能否整除
                    flag = false;
            }
            if (flag){//true标志是素数
                System.out.print(i+" ");
                x++;
                if(x%5==0)//每五个数一行
                    System.out.println();
            }
        }
    }
}
