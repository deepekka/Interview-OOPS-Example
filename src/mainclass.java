
public class mainclass extends abs implements inter{

	@Override
	public void test3() {
		System.out.println("test3");
	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}
	public static void main(String args[]) {
		mainclass m=new mainclass();
		m.test1();
		m.test2();
		m.test3();
		m.test4();
		System.out.println("good");
	}

}
