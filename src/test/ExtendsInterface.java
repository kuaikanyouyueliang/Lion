
public class ExtendsInterface {

}
interface E{
	public void a();
}
interface F{
	public void f();
}
interface C extends E,F{
	
}

class J implements C{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}
class K implements E,F{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}