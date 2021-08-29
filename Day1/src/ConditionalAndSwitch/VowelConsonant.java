package ConditionalAndSwitch;
import java.util.Scanner;
public class VowelConsonant {

    public static void main(String[] args) {
    	char ch;
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a charachter :");
    	ch=s.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
