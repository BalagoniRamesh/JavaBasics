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
class MainClass2A
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Developer d1 = new Developer();
		TestEng t1 = new TestEng();
		Admin a1 = new Admin();
		d1.work();
		d1.getSalary();
		t1.work();
		t1.getSalary();
		a1.work();
		a1.getSalary();
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