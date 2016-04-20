/**
 * User:Administrator
 * Date:2016/4/20 20:16
 */
public class 求n的n次方 {
    public static void main(String[] args) {
        /**
         * 循环的种类：
         * 表达式只能跟布尔类型的
         * 1.for循环
         * 2.while循环
         * 3.do...while循环
         */
        int num=2;
        int power=10;
        int result=1;
        for (int i=0;i<10;i++){
            result=result*num;
        }
        System.out.println(num+"的"+power+"次方是："+result);
    }
}
