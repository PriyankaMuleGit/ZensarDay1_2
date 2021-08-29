package Loops;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String[] args) {
		int num,product=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a No :");
		num=s.nextInt();
	    while (num != 0) {
	      product =product*num%10;
	      num = num/10;
	    }

	    System.out.println("Product of digits: " + product);
	  }
}
