import java.io.IOException;

/**
 * User:Administrator
 * Date:2016/4/19 21:39
 */
public class 判断从键盘输入的是元音字母还是辅音字母 {
    public static void main(String[] args) throws IOException {
        System.out.print("请从键盘输入一个字母：");
        int val=System.in.read();
        char c= (char) val;
        if(val<97||val>122){
            System.out.println("你输入的有误，请输入正确的小写字母！");
        }else {
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(c+":是一个元音字母");
                    break;
                default:
                    System.out.println(c+":是一个辅音字母");
            }
        }

    }
}
