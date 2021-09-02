package CollectionFramework;

public class Student extends Custom_ArrayList {
	
		String name;
		int rollNo;
	    int age;
	    double height;
	    
	    public Student(String name,int rollNo,int age,double height) {
	    	
	    	this.name=name;
	    	this.rollNo=rollNo;
	    	this.age=age;
	    	this.height=height;
	    }
	    void Display() {
			System.out.println("Name :"+name);
			System.out.println("rollNo :"+rollNo);
			System.out.println("age :"+age);
			System.out.println("height :"+height);
	    }
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", height=" + height + "]";
		}
		

}
