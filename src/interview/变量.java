/**
 * 描述：
 * User:
 * Date: 2016/4/4
 * Time: 10:14
 */
public class 变量 {
    /**
     * 作用范围：
     * 1.全局变量
     * 2.局部变量
     */
    /**
     * 类型
     * 1.基本类型 值类型
     * 2.引用类型 引用开辟的内存空间
     */
    private int a;
    private static int b = 0;
    private final static int c = 0;

    public static void main(String[] args) {
        b = 2;
        System.out.println("b=" + b);
        System.out.println("c=" + c);

    }

    public void testVar() {

    }
}
