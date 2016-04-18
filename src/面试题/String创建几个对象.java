/**
 * User:Administrator
 * Date:2016/4/18 20:36
 */
public class String创建几个对象 {
    public static void main(String[] args) {
        String str=new String("good");
        String str1="good";
        String str2=new String("good");

        /**
         * 执行到第七行的时候：
         *  先在String pool里面查找常量“good”,没有创建good对象,new String("good")则在堆中创建一个对象；
         * 执行到第八行：能在String pool中找到good常量，则不用创建对象；
         * 执行到第九行：能在String pool中找到good常量，则不用创建对象，new String("good")则在队中又创建了一个对象；
         */
    }
}
