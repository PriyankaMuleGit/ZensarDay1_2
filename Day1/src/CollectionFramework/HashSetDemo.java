package CollectionFramework;
import java.util.*;
import java.util.HashSet;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet al=new HashSet();
		al.add("My");
		al.add(2);
		al.remove("Java");
		System.out.println(al);
		al.add(" ");
		al.add("Development");
		System.out.println(al);
	}
}
