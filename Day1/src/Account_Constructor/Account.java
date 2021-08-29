package Account_Constructor;
import java.util.Scanner;
public class Account {
	public long accNumber;
	public String customerName;
	
	public Account(){
		accNumber=100;
		customerName="Ram";
		System.out.println("I am default Constructor");
	}
	
	public Account(long x,String y) {
		System.out.println("I am parameterised Constructor");
		System.out.println("accNumber=" +x);
		System.out.println("customerName=" +y);

	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Account acc=new Account();
		Account acc1=new Account(111,"Sham");
	}
	
}
