package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(5);
		list.add(7);
		//list.add(9);
		System.out.println("Before Swapping");
		System.out.println(list);
		Collections.swap(list,0,1);
		System.out.println("After Swapping");
		System.out.println(list);

	}
}
