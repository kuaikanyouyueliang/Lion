/**
 * User:Administrator
 * Date:2016/4/19 21:14
 */
public class Switch用来多种选其一的情况 {
    /**
     * 1.每个case后面都要跟随一个break,否则将继续执行其他case而不进行判断
     * 1.每个case后面必须是常量；
     * switch中表达式是一个整型表达式可以是 int、short、char或byte 不能是String、long
     */
    //输出合格数
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int sum = (int) (Math.random() * 100);
            switch (sum / 10) {
                case 9:
                    System.out.println(sum + ":恭喜你，优秀了！");
                    break;
                case 8:
                    System.out.println(sum + ":恭喜你，优良了！");
                    break;
                default:
                    System.out.println(sum + ":再接再厉！");
            }
        }
        for (int j = 0; j < 5; j++) {
            switch (j) {
                case 1:
                    System.out.println("4");
                case 2:
                    System.out.println("5");
                case 3:
                    System.out.println("6");
            }
        }
        for (int y=0;y<4;y++){
            switch (y){
                case x-3://只能使用常量值或最终常量变量即用final修饰的常量
                    System.out.println(y);
                    break;
                case x-2:
                    System.out.println(y);
                    break;
                default:
                    System.out.println(y);
            }
        }

    }
    private final static int x=5;
}
