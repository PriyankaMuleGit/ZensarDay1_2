package ConditionalAndSwitch;
import java.util.*;
class ThreeDigit
{ 
   public static void main(String args[])
   {

	int num,first,third;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	num=sc.nextInt();
	if(num>99 && num<1000)
	{
		int sum=0;
		System.out.println("It is a Three Digit Number.");
		third=num%10;
		first=num/10;
		first=first/10;
		
		if(first>0 && first<9)
			sum=first+third;
		System.out.println("Sum of 1st and 3rd no is :" +sum);
		
	}
	else
	{
		System.out.println("It is Not a Three Digit Number.");
	}

   }
}
