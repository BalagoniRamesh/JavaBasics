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
