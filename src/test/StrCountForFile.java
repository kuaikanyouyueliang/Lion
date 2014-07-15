import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class StrCountForFile {
	public static void main(String[] args) throws IOException {
//		method("11","dkjdkfjkdjfkdjfk11kjkjkj11kjkjk11kjkjk11jkk");
		readFile();
	}
	private static void readFile() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(new File("E:\\Web\\Workspce\\Eclipse\\Lion\\src\\test\\a.txt")));
		String _tem="";
		int count=0;
		while((_tem=br.readLine())!=null){
			System.out.println(_tem);
			count+=method("33", _tem);
		}
		System.out.println(count);
	}
	/**
	 * 查找指定字符串在字符串中的个数
	 * @param find
	 * @param str
	 */
	private static int method(String find,String str){
		int count=0;
		for(int i=0;i<str.length();){
			if(str.indexOf(find, i)>-1){
				count++;
				i=str.indexOf(find, i)+find.length();
			}else{
				break;
			}
		}
		return count;
	}
}
