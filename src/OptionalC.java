import java.util.Optional;

public class OptionalC {
	int x=10;
public static void main(String[] args) {
	OptionalC o=null;
	Optional<OptionalC> n=Optional.ofNullable(o);
					boolean present = n.isPresent();
					if(present==true)
						System.out.println(o.x);
					else
						System.out.println("null reference");
}
}
