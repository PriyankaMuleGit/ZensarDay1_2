package ConditionalAndSwitch;
import java.util.Scanner;
	public class FindMax {
		public static void main(String[] args) {
			int a,b,c;
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter three numbers to check :-");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a>b && a>c)
				System.out.println("A=" + a + " is Maximum");
			else if(b>a && b>c)
				System.out.println("B=" + b+ " is Maximum");
			else
				System.out.println("C=" + c+ " is Maximum");
			scan.close();
	}


}
