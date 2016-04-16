/**
 * User:Administrator
 * Date:2016/4/11 21:57
 */
public class equals和等号的区别 {
    public static void main(String[] args) {
        /**
         * 等号两边的数据类型必须一致，可相互转换的基本类型除外
         */

        Integer a = 1;
        Integer b = new Integer(1);
        System.out.println(a == b);//针对引用类型比较的是变量所指向的内存地址
        System.out.println(a.equals(b));//Integer重写了equals方法，比较的是内容
        System.out.println(a == b.intValue());

        String x = new String("1");
        String y = new String("1");
        System.out.println(x == y);
        System.out.println(x.equals(y));

        double a1=2222;
        int b1=2222;
        System.out.println(a1==b1);

    }
}

