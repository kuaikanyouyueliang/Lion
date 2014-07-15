import java.util.ArrayList;
import java.util.List;

/**
 * 将一个数字按指定长度 分割后并组成一个字符数组；
 * 原理：将其放到一个list里面，之后取得长度，再new一个String数组；
 *
 */

public class SubString {
	public static void main(String[] args) {
		method1();
	}
	private static void method1(){
		String str="ddfdgdgedgdgdd";
		int len=4;
		//数组长度
		int arrlen=str.length()%4==0?str.length()/4:str.length()/4+1;
		System.out.println(arrlen);
		String[] arr=new String[arrlen];
		if(str.length()>4){
			int j=0;
			for(int i=0;i<str.length();i=i+len){
				if((i+len)>str.length()){
					System.out.println(str.substring(i));
					arr[j]=str.substring(i);
				}else{
					System.out.println(str.substring(i, i+len));
					arr[j]=str.substring(i, i+len);
				}
				j++;
			}
		}
	}
	
	private static void method(){
		String str="ddfdgdgedgdgdd";
		int len=4;
		//数组长度
		int arrlen=str.length()%4==0?str.length()/4:str.length()/4+1;
		System.out.println(arrlen);
		if(str.length()>4){
			List<String> list=new ArrayList<String>();
			for(int i=0;i<str.length();i=i+len){
				if((i+len)>str.length()){
					System.out.println(str.substring(i));
					list.add(str.substring(i));
				}else{
					System.out.println(str.substring(i, i+len));
					list.add(str.substring(i, i+len));
				}
			}
			String[] arr=new String[list.size()];
			for(int i=0;i<list.size();i++){
				arr[i]=list.get(i);
			}
		}
	}
}
