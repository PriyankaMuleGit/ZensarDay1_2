/*1.Create a class Account containing following methods - insert () to insert account 
 data display () to display account information deposit () to deposit amount
withdraw () to withdraw amount check_balance() to check balance
*/
package Class_Object;
import java.util.Scanner;
public class Account {
	public int age;
	public String name;
	public long acc_no;
	public long amt,balance;
	
    void insert() {
    	Scanner s=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=s.next();
		System.out.println("Enter Age: ");
		age=s.nextInt();
		
	}
    void display() {
    	System.out.println("Account Holder : " + name);
    	System.out.println("Age : " + age);
        
    }
    
    long deposit(long x) {
    	amt=amt+x;
    	return amt;
   }
    
    long withdraw(long y) {
    	balance=amt;
    	if(amt<y) {
    		System.out.println("Balance not Sufficient");
    		return 0;
    	} 
    	else {
    		balance=balance-y;
    		return balance;
    	}
    	
    }
	
	public static void main(String[] args) {
		long finalAmount;
		Account acc=new Account();
		acc.insert();
		acc.display();	
		finalAmount=acc.deposit(50000);
		System.out.println("Final Amount after deposit="+ finalAmount);
		finalAmount=acc.withdraw(6000);
		System.out.println("Final AmountAfter withdraw="+ finalAmount);

	}

}

