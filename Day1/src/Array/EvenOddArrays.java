package Array;
import java.util.Scanner;
public class EvenOddArrays {

	public static void main(String[] args) {
		int[] arr=new int[10]; 
		int[] arr1=new int[10]; 
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num of elements");
		int n=scan.nextInt();
		
		System.out.println("Enter element ");
		
		for (int i = 0; i < n; i++) {
			a=scan.nextInt();
			if(a%2==0) 
				arr[i]=a;
			else
			    arr1[i]=a;
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Even array :"+arr[i]);	
		}
		
		System.out.println();

		
		for (int i = 0; i < n; i++) {
			System.out.println("Odd array :"+arr1[i]);	
		}
	}

}
