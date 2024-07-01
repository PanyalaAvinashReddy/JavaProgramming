package collections;
import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		//tree set prints the values in ascending order
		TreeSet<String> a = new TreeSet<>();
		a.add("avinash");
		a.add("bhanu");
		a.add("akhil");
		a.add("akhil");
		System.out.println(a);

		TreeSet<Integer> b = new TreeSet<>();
		b.add(2);
		b.add(6);
		b.add(1);
		b.add(-2);
		b.add(2);
		System.out.println(b);

	}

}
