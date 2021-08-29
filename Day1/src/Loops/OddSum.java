package Loops;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a NO :");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
				sum=sum+i;
		}
		System.out.println("Sum of Odd no : "+ sum);

	}

}
