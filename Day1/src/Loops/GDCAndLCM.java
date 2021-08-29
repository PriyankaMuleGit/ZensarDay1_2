package Loops;
import java.util.Scanner;
public class GDCAndLCM {
	public static void main(String[] args) {
		int num1,num2,g,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1=s.nextInt();
		num2=s.nextInt();
		
		for(int i=2;i<=num1&&i<=num2;i++) {
			if(num1%i==0 && num2%i==0)
			{
				g=i;
				System.out.println("GCD ="+g);
			}
		}
		l=num1*num2;
		System.out.println("LCM ="+l);

	}
}
