package Array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		
		String arr[]=new String[10];
		String arr1[]=new String[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter elements in Array");
		for(int i=0;i<5;i++) {
			arr[i]=scan.nextLine();
		}
		
		int i=0;
		int j=0;
				
			while(i<=4) {
				arr1[j]=arr[i];
				i++;
				j++;
			}

			System.out.println();
			
			for(int k=0;k<5;k++) {
				System.out.println(arr1[k]);
			}
			
	}
	
}
