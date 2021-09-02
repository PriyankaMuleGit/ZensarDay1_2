package CollectionFramework;

import java.util.ArrayList;

public class ArrayListColor {
	public static void main(String[] args) {
    ArrayList<String> l=new ArrayList();
		
		l.add("Red");
		l.add("Purple");
		l.add("yellow");
		l.add("Green");
		//System.out.println(l);
		
		int n=l.size();
		String arr[]=new String[10];
		
		for(int i=0;i<n;i++) {
			arr[i]=l.get(i);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
