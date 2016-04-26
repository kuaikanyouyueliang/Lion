import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/4/26.
 */
public class RandomAccessFile操作类 {
    public static void main(String[] args) {
        //创建File对象
        File file=new File("E:\\workspace\\Lion\\src\\面试题\\RandomAccessFile.txt");
        //创建字节数组，用来暂存加密后的字节
        byte[] bf=new byte[(int) file.length()];
        //创建随机存取文件对象
        try {
            //创建文件RandomAccessFil.txt 的RandomAccessFile对象
            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
            //将文件中的全部内容读取到数组bf中
            randomAccessFile.read(bf);
            //对每个字节加12进行加密
            for (int i=0;i<bf.length;i++){
                bf[i]= (byte) (bf[i]+12);
            }
            //清空原文件
            randomAccessFile.setLength(0);
            //将现有的字节写到文件中
            randomAccessFile.write(bf);
            //移动文件指针
            randomAccessFile.seek(3);
            System.out.println((char) randomAccessFile.read());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
