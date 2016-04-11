/**
 * User:Administrator
 * Date:2016/4/11 21:34
 */
public class 计算x的n次方的方法 {
    public static void main(String[] args) {
        System.out.println(calculate(10, 3));
    }

    /**
     * 10的三次方 10*10*10
     *
     * @param x
     * @param n
     * @return
     */
    public static int calculate(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }
}
