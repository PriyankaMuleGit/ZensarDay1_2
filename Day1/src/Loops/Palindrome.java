package Loops;

public class Palindrome {
	public static void main(String[] args) {
		int first,third,sum=0;
		for(int i=100;i<=500;i++) {
			third=i%10;
			first=i/10;
			first=first/10;
			
			if(first==third)
				System.out.println("Palindrome "+i);
			
		}
	}
}
