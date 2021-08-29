/*
  WAP to print even numbers from 121 to 229 using for loop. 
 */
package Loops;

public class EvenNumbers {
	public static void main(String[] args) {
		System.out.println("Even Numbers :");
		for(int i=121; i<=229; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}

}
