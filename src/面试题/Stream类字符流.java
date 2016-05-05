import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by Administrator on 2016/5/5.
 */
public class Stream类字符流 {
    /**
     * 字符流：16位，2个字节；
     * 一次性处理两个字节的流，叫做字符流；
     * @param args
     */
    public static void main(String[] args) throws IOException {
        int c;
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(System.out);
        System.out.println("请输入字符，并按回车结束：");
        while ((c=inputStreamReader.read())!='\n'){
            outputStreamWriter.write(c);
        }
        outputStreamWriter.close();//如果不关闭输出流，则屏幕上什么都不显示
        inputStreamReader.close();

    }
}
