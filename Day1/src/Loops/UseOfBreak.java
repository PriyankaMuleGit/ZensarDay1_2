package Loops;

public class UseOfBreak {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i==35) {
				System.out.println(" break when i =" +i);
				break;
			}	
			else
				System.out.println(i);
					
		}
	}
}
