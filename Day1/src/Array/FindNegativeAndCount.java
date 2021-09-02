package Array;

public class FindNegativeAndCount {

	public static void main(String[] args) {
		int arr[]=new int[]{11,-22,-33,44,55,66,-77,88,-99};
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Num of negative numbers are "+count);
	}
}