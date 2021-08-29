package Class_Object;

public class Employee {
	private int id;
	private String name;
	private long salary;
	
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public long getsalary()
	{
		return salary;
	}
	
	public void setid(int id)
	{
		this.id=id;
		System.out.println("Id =" +id);

	}
	public void setname(String name)
	{
		this.name=name;
		System.out.println("Name =" +name);

	}
	public void setid(long salary)
	{
		this.salary=salary;
		System.out.println("Salary =" +salary);

	}
	
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setid(10);
		e.setid(50000);
		e.setname("Ramuu");
	}

}

