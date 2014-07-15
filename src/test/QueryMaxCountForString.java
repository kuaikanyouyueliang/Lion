/**
 * 查询字符串中最出现最多的字符
 * 原理：总长度减去现有长度就是被替换掉的字符串
 */
public class QueryMaxCountForString {
	public static void main(String[] args) {
		System.out.println(queryMaxCountByFor("111121e1311kkkkkjjjjjjjjjjjjjiiiiiii"));
	}
	private static int queryMaxCountByFor(String str){
		if(str==null||str.length()<1)
			return 0;
		String maxChar="";
		int maxCount=0;
		int len=str.length();
		while(len>0){
			String _tmp=String.valueOf(str.charAt(0));
			str=str.replaceAll(_tmp, "");
			int _tmpcount=len-str.length();
			if(_tmpcount>maxCount){
				maxChar=_tmp;
				maxCount=_tmpcount;
			}
			len=str.length();
		}
		System.out.println(maxChar);
		System.out.println(maxCount);
		return 0;
	}
}
