package CollectionFramework;

import java.util.ArrayList;

public class ArraylisttoArray {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(12);
		list.add(15);
		System.out.println(list);
		list.toArray();
		System.out.println(list);
	}
}
