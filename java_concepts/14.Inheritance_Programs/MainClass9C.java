class Employee
{
	public String id;
	public String name;
	public double salary;
	
	//public Employee(){}
	public Employee(String id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void employdetails()
	{
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
}
class Developer extends Employee
{
	public String lang;
	public Developer(String id, String name, double salary, String lang)
	{
		//super(id, name, salary);
		super.id=id;
		super.name=name;
		super.salary=salary;
		this.lang = lang;
	}
	public void developerInfo()
	{
		System.out.println("***********************");
		employdetails();
		System.out.println("Language : "+lang);
		System.out.println("***********************");
	}
}
class Testing extends Employee
{
	public String typeOfTesting;
	public Testing(String id, String name, double salary, String typeOfTesting)
	{
		super(id, name, salary);
		this.typeOfTesting = typeOfTesting;
	}
	public void testEngDetails()
	{
		System.out.println("***********************");
		employdetails();
		System.out.println("typeOfTesting : "+typeOfTesting);
		System.out.println("***********************");
	}
}

class MainClass9C
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Developer d1 = new Developer("IBM201", "Raja", 31000.3, "web");
		Testing t1 = new Testing("IBM403", "Abhi", 26000.4, "manual");
		d1.developerInfo();
		t1.testEngDetails();
		System.out.println("main ends...");
	}
}
/*
class Employee
{
	public String id;
	public String name;
	public double salary;
	
	public Employee(String id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void employdetails()
	{
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
}
class Developer extends Employee
{
	public String lang;
	public Developer(String id, String name, double salary, String lang)
	{
		super(id, name, salary);
		this.lang = lang;
	}
	public void developerInfo()
	{
		System.out.println("***********************");
		employdetails();
		System.out.println("Language : "+lang);
		System.out.println("***********************");
	}
}
class Testing extends Employee
{
	public String typeOfTesting;
	public Testing(String id, String name, double salary, String typeOfTesting)
	{
		super(id, name, salary);
		this.typeOfTesting = typeOfTesting;
	}
	public void testEngDetails()
	{
		System.out.println("***********************");
		employdetails();
		System.out.println("typeOfTesting : "+typeOfTesting);
		System.out.println("***********************");
	}
}

class MainClass9C
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Developer d1 = new Developer("IBM201", "Raja", 31000.3, "web");
		Testing t1 = new Testing("IBM403", "Abhi", 26000.4, "manual");
		d1.developerInfo();
		t1.testEngDetails();
		System.out.println("main ends...");
	}
}

main starts...
***********************
id : IBM201
Name : Raja
Salary : 31000.3
Language : web
***********************
***********************
id : IBM403
Name : Abhi
Salary : 26000.4
typeOfTesting : manual
***********************
main ends...
*/