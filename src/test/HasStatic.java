
public class HasStatic {
	private static int x=100;
	public static void main(String[] args) {
		HasStatic has1=new HasStatic();
		has1.x++;
		System.out.println(x);
	}
}
