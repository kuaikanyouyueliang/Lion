import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exceptiontest {
	public void trythis() {
		try {
			System.out.print("a");
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.print("b");
		} catch (Exception e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
	}
	public static void main(String[] args) throws FileNotFoundException {
//		String s= "Jessica "; 
//		char c=s.charAt(6);
//		DataInputStream din = new DataInputStream(new FileInputStream("autoexec.bat"));
//		File f = new File("/","autoexec.bat");
//		InputStreamReader in = new InputStreamReader(System.in);
//		OutputStreamWriter out = new OutputStreamWriter(System.in); 
		
		String s1=new String("hello"); 
		String s2=new String("there"); 
		String s3=new String("0");
		s3=s1+s2;
		System.out.println(s3);
		System.out.println(Math.random());
		char c=new Character('a');
	}
}
