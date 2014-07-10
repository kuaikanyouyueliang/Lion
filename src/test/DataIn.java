import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class DataIn {
	public static void main(String[] args) throws FileNotFoundException {
		DataInputStream din=new DataInputStream(new BufferedInputStream(new FileInputStream("E:\\Web\\Workspce\\Eclipse\\Lion\\src\\test\\a.txt")));
		System.out.println(din);
	}
}
