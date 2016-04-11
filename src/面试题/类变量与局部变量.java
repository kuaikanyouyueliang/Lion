/**
 * User:Administrator
 * Date:2016/4/11 20:49
 */
public class 类变量与局部变量 {
    private static int x;

    public static void main(String[] args) {
        name(1);
        System.out.println(x);
        name01(x);
        System.out.println(x);
    }
    public static void name(int x){
        x++;//操作的是局部变量，没有返回值
    }
    public static void name01(int y){
        x++;//操作的是类变量
    }
}
