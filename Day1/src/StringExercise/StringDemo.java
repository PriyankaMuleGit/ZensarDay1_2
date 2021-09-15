package StringExercise;

import java.util.HashMap;

public class StringDemo {
	public static void main(String[] args) {
		int count=0;
		String name="Have a nice nice day";
		String[] arr =name.split(" ");
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int wordCount=map.get(arr[i]);
				map.put(arr[i], wordCount+1);
			}
			else
				map.put(arr[i],1);
		}
		
		System.out.println(map);
	}
}















