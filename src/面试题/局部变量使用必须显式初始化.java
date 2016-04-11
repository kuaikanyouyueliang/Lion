/**
 * User:Administrator
 * Date:2016/4/11 21:02
 */
public class 局部变量使用必须显式初始化 {
    public void demo(){
        int a,b,c = 0;
        a=100;
        while (a>100){
            b=a*(a-1);
            c=c-1;
            a--;
        }
    }
}
