import java.io.*;

/**
 * Created by Administrator on 2016/4/27.
 */
public class Stream类字节流和字符流 {
    /**
     * 根据数据类型的不同，分为两类：
     * 字节流 Byte，一次读写8位二进制数；InputStream，OutputStream
     * 字符流 Character，一次读写16位二进制数；Reader，Writer
     *
     * FileInputStream、FileOutputStream分别是InputStream、OutputStream直接子类
     *
     * 输入流代表从外设流入到内存中的数据序列；
     * 输出流代表从内存流向外设的数据序列；
     *
     *
     */
    public static void main(String[] args) throws IOException {
        //创建File对象
        File file=new File("E:\\workspace\\Lion\\src\\面试题\\","Java重要的循环语句.java");
        //将数据（流），读入内存中
        FileInputStream fileInputStream=new FileInputStream(file);
        //创建file长度的字节数组
        byte[] b=new byte[(int) file.length()];
        //将内存中的file对象读入到字节数组中
        fileInputStream.read(b);
        //创建临时文件
        File fileTemp=new File("E:\\workspace\\Lion\\src\\面试题\\","Java重要的循环语句Temp.txt");
        //将数据（流）写入到文件fileTemp中
        FileOutputStream fileOutputStream=new FileOutputStream(fileTemp);
        //将字节写入到文件fileTemp中
        fileOutputStream.write(b);
        //关闭输出流
        fileOutputStream.close();
        //关闭输入流
        fileInputStream.close();

    }
}
