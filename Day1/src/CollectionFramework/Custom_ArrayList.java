package CollectionFramework;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Custom_ArrayList {

	public static void main(String[] args) {
		String name;
		int rollNo;
		int age;
		double height;
		int total;
		ArrayList l=new ArrayList();
		
		System.out.println("Enter size you want to enter :");
		Scanner scan=new Scanner(System.in);
		total=scan.nextInt();
		
		for(int i=0;i<total;i++) {
			System.out.println("Enter name,roll,age,height");
            name=scan.next();
            rollNo=scan.nextInt();
            age=scan.nextInt();
            height=scan.nextDouble();
            Student s1= new Student(name,rollNo,age,height);
            l.add(s1);
		}

		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Student s=(Student)itr.next();
			//System.out.println(itr.next());
			s.Display();
		}
	}

}
