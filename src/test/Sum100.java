
public class Sum100 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println(sum);
		System.out.println(method(5));
		System.out.println(method1(5));
	}
	/*有5个人坐在一起，
	 * 问第五个人多少岁？他说比第4个人大2岁。
	 * 问第4个人岁数，他说比第3个人大2岁。
	 * 问第三个人，又说比第2人大两岁。
	 * 问第2个人，说比第一个人大两岁。
	 * 最后问第一个人，他说是10岁。请问第五个人多大？
	 * 第n个人的岁数为 
	 * 1 10 		10
	 * 2 10+2		10+2*(n-1)
	 * 3 10+2+2		10+2*(n-1)
	 * 4 10+2+2+2	10+2*(n-1)
	 **/
	private static int method(int n){
		if(n==1){
			return 10;
		}else{
			return method(n-1)+2;
		}
	}
	private static int method1(int n){
		return 10+2*(n-1);
	}
}
