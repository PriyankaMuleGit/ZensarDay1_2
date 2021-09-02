package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		Scanner scan= new Scanner(System.in);
		int a;
		for(int i=0;i<=4;i++) {
			System.out.println("Enter an Element :");
			a=scan.nextInt();
			l.add(a);
		}
		
		System.out.println();
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
