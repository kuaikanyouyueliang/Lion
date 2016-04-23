/**
 * Created by Administrator on 2016/4/23.
 */
public class 求1到10的阶乘 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i != 0) {
                int result = i;
                for (int j = (i - 1); j > 0; j--) {
                    result = result * j;
                }
                System.out.println(i + "!=" + result);
            } else {
                System.out.println(i + "!=1");
            }
        }

    }


    /**
     * 错误的算法
     */
    private static void layerDemo() {
        for (int i = 1; i <= 10; i++) {
            int layer = 0;
            int j = 1;
            loop:
            while (true) {
                layer = layer + i * j;
                j++;
                if (j > i) {
                    break loop;
                }
            }
            System.out.println(i + "!=" + layer);

        }
    }
}
