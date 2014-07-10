
public class A {
	public A(){
		System.out.println("A");
	}
	public static void main(String[] args) {
		B b=new B();
	}
}

class B extends A{
	public B(){
		System.out.println("B");
	}
	
}