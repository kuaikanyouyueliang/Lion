/**
 * User:Administrator
 * Date:2016/4/20 20:52
 */
public class 求100到999之间的水仙花数 {
    /**
     * 水仙花数：407=4*4*4+0+7*7*7
     * 各个位数的3次方相加
     * @param args
     */
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int a=i/100;//取百位上的数
            int b=(i/10)%10;//取十位上的数
            int c=i%10;//取个位上的数
            int sum=getCubic(a)+getCubic(b)+getCubic(c);
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    //构造相同的操作
    private static int getCubic(int x){
        return x*x*x;
    }
}
