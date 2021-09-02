package Array;

public class Avg_Array {
	public static void main(String[] args) {
		int sum=0,avg=0;
		int []arr={0,1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("Average = "+avg);
	}
}
