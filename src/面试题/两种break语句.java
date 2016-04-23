/**
 * Created by Administrator on 2016/4/23.
 */
public class 两种break语句 {
    /**
     * 两种break语句
     * 1.带标号，常用于嵌套循环；
     * 2.不带标号，跳出当前循环；
     */
    public static void main(String[] args) {
        breakWithOutFlag();
        breakWithFlag();
    }
    //不带标号
    private static void breakWithOutFlag() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("j without flag=" + j);
                    break;
                }
            }
        }
    }
    //带标号
    private static void breakWithFlag(){
        flag:
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (j==3){
                    System.out.println("j with flag="+j);
                    break flag;
                }
            }
        }
    }
}
