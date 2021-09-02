package Array;
import java.util.Scanner;
public class SearchElement {
	public static void main(String[] args) {
	    int n;
		int arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter integer "+arr.length+ " values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter a number to Search :");
		n=s.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				System.out.println("Element "+n+" is present at a["+i+"]="+arr[i]);
			else
				System.out.println(n+" is not present at a["+i+"]");
		}

	}
}
