/**
 * abstract修饰符可以用于类、方法、属性、事件和索引指示器（indexer），表示其为抽象成员，抽象方法是没有方法体的方法。
 * abstract 不可以和static、virtual、final、native一起使用
 * abstract不能修饰字段；
 */
public abstract class abstract的用法 {
	private String a="";
	public abstract void test2();
	public void test1(){
		System.out.println("test1");
	}
	String $b;
	public static void main(String[] args) {
		int[] number={1,2,3,4,4};
		
		abstract的用法 a=new abstract的用法(){

			@Override
			public void test2() {
				System.out.println("test2");
				
			}
			
		};
		a.test1();
		a.test2();
	}
	public  String getA() {
		return a;
	}
	public  void setA(String a) {
		this.a = a;
	}
	
}
