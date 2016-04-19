/**
 * User:Administrator
 * Date:2016/4/19 21:06
 */
public class 判断随机产生的四位数是不是闰年 {
    /**
     * 能被400整出 或 能被4整除但不能被100整除
     */
    public static void main(String[] args) {
//        System.out.println(Math.random()*10000);
        for (int i=0;i<10;i++){
            printLeapYear((int) (Math.random() * 10000));
        }
    }

    private static void printLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + ":是闰年！");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + ":是闰年！");
        } else {
            System.out.println(year + ":不是闰年！");
        }
    }
}
