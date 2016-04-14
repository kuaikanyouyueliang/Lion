import java.util.Arrays;

/**
 * User:Administrator
 * Date:2016/4/14 21:27
 */
public class 长度为10的整型数组排序 {
    public static void main(String[] args) {
//        getArrayMaxValue(getArray(new int[10]));
        sortArray(getArray(new int[10]));
//        sortArrayBubble(getArray(new int[10]));
    }

    //初始化数组
    public static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    //去最大值
    public static void getArrayMaxValue(int[] array){
        int _temp=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]>_temp){
                _temp=array[i];
            }
        }
        System.out.println("最大值："+_temp);
    }
    //自带排序
    public static void sortArray(int[] array){
        Arrays.sort(array);
//        Arrays.sort(array,0,array.length-1);
        for (int i:array){
            System.out.print(i+" ");
        }
    }
    //冒泡排序
    public static void sortArrayBubble(int[] array){
        for (int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int _temp=array[i];
                    array[i]=array[j];
                    array[j]=_temp;
                }
            }
        }
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
