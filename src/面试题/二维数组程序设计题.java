/**
 * User:Administrator
 * Date:2016/4/17 11:56
 */
public class 二维数组程序设计题 {
    /**
     * 两个整型数组a[]和b[],两个数组中均有5个元素
     * 1.分别输出两个数据的元素及长度
     * 2.数组c为a、b中对应坐标位的成绩
     */
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        printArray(getArray(a), "a");
        System.out.println();
        printArray(getArray(b), "b");
        System.out.println();
        for(int i=0;i<c.length;i++){
            c[i]=a[i]*b[i];
        }
        printArray(c,"c");
        System.out.println();

    }

    private static int[] getArray(int[] a) {
//        for (int i : a) {
//            i = (int) (Math.random() * 100);
//        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        return a;
    }

    private static void printArray(int[] a, String varName) {
        System.out.print(varName + "=");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.print(" 长度=" + a.length);

    }
}
