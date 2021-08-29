package ConditionalAndSwitch;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter year to chack leap or not :-");
		year=scan.nextInt();
		if(year%100!=0 && year%4==0 || year%400==0)
			System.out.println(year + " is Leap Year");
		else
			System.out.println(year + " is not Leap Year");
		scan.close();
	}
}
