import java.util.Arrays;

/**
 * User:Administrator
 * Date:2016/4/14 21:10
 */
public class 一维数组 {
    /**
     * 存放具有相同数据类型的数值的数据结构；
     * 先后顺序固定，大小固定；
     */
    private static int[] a=new int[10];
    public static void main(String[] args) {
        //初始化一
        int[] array={1,2,3,4,5};
        String[] strings={"a","b","c","d"};
        //初始化二
        int[] arrayNew=new int[10];

        float[] floats = new float[10];
        System.out.println(floats[0]);
        System.out.println(a[1]);
    }

}
