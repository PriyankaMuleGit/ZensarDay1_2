package ConditionalAndSwitch;
import java.util.*;
class BankATM{
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
    int amt,rem;
    System.out.print("Enter a amount : ");
    amt=scan.nextInt();
    rem=amt/2000;
    amt=amt%2000;
    System.out.println("Notes of 2000: "+rem);
    
    rem=amt/500;
    amt=amt%500;
    System.out.println("Notes of 500: "+rem);
    
    rem=amt/200;
    amt=amt%200;
    System.out.println("Notes of 200: "+rem);
    
    rem=amt/100;
    amt=amt%100;
    System.out.println("Notes of 100: "+rem);
    
    rem=amt/50;
    amt=amt%50;
    System.out.println("Notes of 50: "+rem);
    
    
    }
}