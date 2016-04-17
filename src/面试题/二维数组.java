/**
 * User:Administrator
 * Date:2016/4/17 10:59
 */
public class 二维数组 {
    public static void main(String[] args) {
        //第几行地几列
        //初始化
        int[][] a = {{1, 2, 3}, {3, 4, 5}, {1, 2, 4, 6}, {1, 2}};
        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + (i + 1) + "几个人对应：");
            for (int j : a[i]) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        dArray();
    }
    //三维数组
    private static void dArray(){
        int[][][] a=new int[4][][];
        a[0]=new int[4][];
        a[1]=new int[2][];
        a[2]=new int[5][];
        a[3]=new int[3][];
        int count=0;
        int sum=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=new int[i+j+1];
                count++;
            }
            sum=sum+a[i].length;
        }
        System.out.println(sum==count?"yes":"no");
    }
}
