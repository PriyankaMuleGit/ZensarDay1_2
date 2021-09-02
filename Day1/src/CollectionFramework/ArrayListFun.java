package CollectionFramework;

import java.util.ArrayList;

public class ArrayListFun {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		
		System.out.println(l);
		
		ArrayList l1=new ArrayList();
		l1.add(14);
		l1.add(15);
		l1.addAll(2,l);
		
		System.out.println(l1);
	    l.removeAll(l);
	    l.retainAll(l1);
		int a=l1.size();
		boolean b=l.isEmpty();
		int c=l.indexOf(5);
		boolean d=l.contains("Ram");
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
