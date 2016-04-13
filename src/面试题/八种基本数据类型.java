/**
 * 描述：
 * User:
 * Date: 2016/4/4
 * Time: 15:53
 */
public class 八种基本数据类型 {
    /**
     * 每种字节有两类
     * 每种基本类型对应一个包装类
     * 不带小数点的数字会默认为int类型
     * 带小数点的数字默认为double类型
     * 低精度可以直接赋值给高精度，高精度赋值给低精度时需要强制转换
     */
    public static void main(String[] args) {


        //1字节 8bit
        byte b = 1;
        boolean bool = false;
        //2字节 16bit
        short s = 1;
        char c = 'a';
        //4字节 32bit
        int i = 1;
        float f = 1;
        //8字节 64bit
        long l = 1;
        double d = 1;
        System.out.println(b);
        System.out.println(bool);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        float x= (float) 12.56;
        float y= (float) 12.6;
//        System.out.println(x);
//        System.out.println(y);
        char z='你';
        System.out.println(z);

    }
}
