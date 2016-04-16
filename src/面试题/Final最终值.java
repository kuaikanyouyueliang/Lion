/**
 * User:Administrator
 * Date:2016/4/14 21:09
 */
public class Final最终值 {
    /**
     * 基本类型的值不可以改变；
     * 引用类型的值不可以改变地址，但是可以改变内容；
     */
    private final static int[] a=new int[10];
    private static int b=1;

    public static void main(String[] args) {
        b=2;
        System.out.println("b = " + b);

        for (int i:a){
            i=(int)(Math.random()*10);
            System.out.println("i = " + i);
        }
    }
}
