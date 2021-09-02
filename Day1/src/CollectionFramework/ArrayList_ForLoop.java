package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ForLoop {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		Scanner scan= new Scanner(System.in);
		int a;
	/*	for(int i=0;i<=4;i++) {
			System.out.println("Enter an Element :");
			a=scan.nextInt();
			l.add(a);
		}
		System.out.println("  "+l);
		
	*/
		l.add(11);
		l.add(22);
		l.add(33);
		l.forEach((b) -> System.out.println(b));
	}
}
