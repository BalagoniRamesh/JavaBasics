class Employee 
{
	public int id;
	public String name;
	public double salary;
	public double yoe;

	public Employee(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee(int id,String name, double salary, double yoe)
	{
		this(id, name, salary);
		this.yoe = yoe;
	}
	public void displayFresherDetails()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
	public void displayExpDetails()
	{
		displayFresherDetails();
		System.out.println("Years of Exp : "+yoe);
	}
}

class EmployeeMainClass
{

	public static void main(String[] args)
	{
		System.out.println("main starts...");
		Employee e1 = new Employee(12, "Raj", 32000.6, 2.4);
		Employee e2 = new Employee(43, "Rani", 32000.7);
		e1.displayExpDetails();
		e2.displayFresherDetails();
		System.out.println("main ends...");
	}
}
/*
main starts...
id: 12
name: Raj
salary: 32000.6
Years of Exp : 2.4
id: 43
name: Rani
salary: 32000.7
main ends...
*/