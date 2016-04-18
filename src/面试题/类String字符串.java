/**
 * User:Administrator
 * Date:2016/4/18 20:06
 */
public class 类String字符串 {
    public static void main(String[] args) {
        //初始化 String是最终类，不允许继承是最终类.StringBuffer
        String str = "nice";
        String str01 = new String();
        str01="nice";
        String str03=new String("nice");
        String str04=Integer.toString(123456);
        String str05=new String("this is a dog");
        System.out.println(str05.length());
        method(str);
        System.out.println(str);
    }

    private static void method(String str){
        str="Good-bye";
    }
}
