/**
 * User:Administrator
 * Date:2016/4/20 20:48
 */
public class dowhile和while的嵌套 {
    /**
     * do...while 和 while 的嵌套使用
     * @param args
     */
    public static void main(String[] args) {
        int n = 1;
        do while (n > 1)
            System.out.println("n=" + n);
        while (n < 1);
    }
}
