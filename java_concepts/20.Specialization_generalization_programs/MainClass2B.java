class Employee
{
	public void work()
	{
		System.out.println("write for 9:00AM to 6:00pm"); 
	}
	public void getSalary()
	{
		System.out.println("Salary credited  end of the month"); 
	}
}
class Developer extends Employee
{
}
class TestEng extends Employee
{
}
class Admin extends Employee
{
}
class MainClass2B
{ 
	public static void gotoCompany(Employee emp)
	{
		emp.work();
		emp.getSalary();
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		gotoCompany(new Developer());
		gotoCompany(new TestEng());
		gotoCompany(new Admin());
		System.out.println("main ends...");
	}
}
/*
main starts...
write for 9:00AM to 6:00pm
Salary credited  end of the month
write for 9:00AM to 6:00pm
Salary credited  end of the month
write for 9:00AM to 6:00pm
Salary credited  end of the month
main ends...
*/