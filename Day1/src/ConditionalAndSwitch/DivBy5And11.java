package ConditionalAndSwitch;
import java.util.Scanner;
public class DivBy5And11 {
	public static void main(String[] args) {
		int num;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number :-");
		num=scan.nextInt();
		if(num%5==0 && num%11==0)
			System.out.println(num + " Divisible by 5 and 11");
		scan.close();

	}

}
