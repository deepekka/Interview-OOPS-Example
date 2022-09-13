
@FunctionalInterface
public interface FunInt {
public void test1();
default void test2() {
	System.out.println("test2");
}
}
