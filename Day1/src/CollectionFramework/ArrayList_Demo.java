package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		int totalElements;

		try {
			String myString;
			Scanner scan = new Scanner(System.in);
			System.out.println("How many elements you want to add :");
			totalElements = scan.nextInt();

			for (int i = 0; i < totalElements; i++) {
				System.out.println("Enter Values at position  " + i);
				myString = scan.next();
				if (myString.equals("sita"))
					throw new InvalidName("You entered invalid name " + myString);
				al.add(myString);
			}

		} catch (InvalidName e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Total elements added " + al.size());
		}

		/*
		 * al.add("Ram"); //al.add(11); System.out.println(al); al.remove("Ram");
		 * System.out.println(al); al.add("Seeta"); al.add("Shyam"); al.add(2,"M");
		 */
		// System.out.println(al);

		Iterator itr = al.iterator();
		int count = 0;
		while (itr.hasNext()) {
			System.out.println(count++ + " " + itr.next());
		}
	}
}
