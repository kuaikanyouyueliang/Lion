import java.io.File;

/**
 * Created by Administrator on 2016/4/26.
 */
public class File类操作方法 {
    public static void main(String[] args) {
        File file=new File("E:\\workspace\\Lion\\src\\Web\\com\\lion\\webservice\\","WsClient.java");
        fileInfo(file);
    }
    public static void fileInfo(File file){
        System.out.println("文件名："+file.getName());
        System.out.println("路径："+file.getPath());
        System.out.println("父路径："+file.getParent());
        System.out.println("绝对路径："+file.getAbsolutePath());
        if(file.exists()){
            System.out.println("文件存在");
            System.out.println("是目录？"+file.isDirectory());
            System.out.println("可读？"+file.canRead());
            System.out.println("可写？"+file.canWrite());
            System.out.println("文件的长度："+file.length());
            System.out.println("文件最后修改的日期："+file.lastModified());
        }
        if(file.delete()){
            System.out.println(file.delete()?"删除失败":"删除成功");
        }
    }
}
