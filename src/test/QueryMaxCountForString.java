/**
 * 查询字符串中最出现最多的字符
 *
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
		for(int i=0;i<len;i++){
			String _tmp=String.valueOf(str.charAt(0));
			str=str.replaceAll(_tmp, "");
			int _tmpcount=len-str.length();
			if(_tmpcount>maxCount){
				maxChar=_tmp;
				maxCount=_tmpcount;
			}
			len=str.length();
			i=0;
		}
		System.out.println(maxChar);
		System.out.println(maxCount);
		return 0;
	}
}
