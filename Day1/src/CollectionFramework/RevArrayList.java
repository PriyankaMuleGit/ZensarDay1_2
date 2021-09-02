package CollectionFramework;

import java.util.ArrayList;

public class RevArrayList {

	public static void main(String[] args) {
	    ArrayList<String> l=new ArrayList();

		l.add("First");
		l.add("Second");
		l.add("Third");
		l.add("Fourth");
		
		int n=l.size();
		String arr[]=new String[10];
		String arr1[]=new String[10];
		
		for(int i=0;i<n;i++) {
			arr[i]=l.get(i);
		}
		
		int i=n-1;
		int j=0;
				
			while(i>=0) {
				arr1[j]=arr[i];
				i--;
				j++;
			}
		
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]  +"    "+  arr1[k]);
		}
		
	}

}
