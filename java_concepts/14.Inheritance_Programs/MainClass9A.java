class Developer
{
	String id;
	String name;
	double salary;
	String lang;
	public Developer(String id, String name, double salary, String lang)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.lang=lang;
	}
	public void developerInfo()
	{
		System.out.println("***********************");
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Language : "+lang);
   }
}
class Testing
{
	String id;
	String name;
	double salary;
	String typeOfTesting;
	public Testing(String id, String name, double salary, String typeOfTesting)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.typeOfTesting=typeOfTesting;
	}
	public void testEngDetails()
	{
		System.out.println("***********************");
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Type Of testing : "+typeOfTesting);
   }
}
class MainClass9A
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
main starts...
***********************
id : IBM201
Name : Raja
Salary : 31000.3
Language : web
***********************
id : IBM403
Name : Abhi
Salary : 26000.4
Type Of testing : manual
main ends...
*/