public class FatherClass {
	public FatherClass() {
		System.out.println("FatherClass");
	}

	public void method() {
		
	}
	public int method(int a,int b) {
		return b;
		
	}
	public static void main(String[] args) {
//		FatherClass fc = new FatherClass();
//		ChildClass cc = new ChildClass();
//		long l=9;
//		double d=10.434444;
//		float f=10.1f;
//		System.out.println(d);
//		System.out.println(f);
//		long ll=999;
		char[] ch={'a','b','c'};
		ch[0]='g';
		System.out.println(ch);
	}

}

class ChildClass extends FatherClass {

	public ChildClass() {
		super();
		
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
	}
	public ChildClass(int a,int b) {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
	}
	public int sub() {
		return 0;
	}

}