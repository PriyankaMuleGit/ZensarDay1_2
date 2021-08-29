package Loops;
import java.util.Scanner;

public class NoOfDigit {
	public static void main(String[] args) {
		int num,count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a No :");
		num=s.nextInt();
	    while (num != 0) {
	      num = num/10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
		
	}

