
public interface inter {

	public void test3();
	default public void test4() {
		System.out.println("test4");
	}
}
