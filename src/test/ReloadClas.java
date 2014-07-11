/**
 * 重写
 * @author lenovo
 *
 */
public class ReloadClas {
	protected int method(int a,int b){
		return 0;
	}
	void s() {
	}
	public static void main(String[] args) {
		System.out.println((new int[10])[9]);
	}
}

class RealoadClass extends ReloadClas{
	private int method(int a,Long b){
		return 0;
	}
}