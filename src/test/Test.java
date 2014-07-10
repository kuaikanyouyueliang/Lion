public class Test {
	int count = 9;

	public void count1() {
		int count = 10;
		System.out.println("count1" + count);
	}

	public void count2() {
		System.out.println("count2" + count);
	}

	public static void main(String args[]) throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Caught in main()");
		}
		System.out.println("nothing");
	}

	public int count(char c, int i, double d) {
		// return c*i;
		// return c*(int)d;
		// return (int)c*(int)d;
		return i * (int) d;
	}
}
