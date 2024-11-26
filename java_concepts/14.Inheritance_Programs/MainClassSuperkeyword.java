/*
class Employee
{
	int i = 100;	
}
class Developer extends Employee
{
	int i = 7;	
	public void display()
	{
		int i = 22;	
		System.out.println(this.i);
		System.out.println(super.i);
		System.out.println(i);
	}
}
class MainClassSuperkeyword
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Developer d1 = new Developer();	
		d1.display();	
		System.out.println("main ends...");
	}
}


main starts...
7
100
22
main ends...
*****************************************************************............BY_USING_SUPER_KEYWORD........................*******************************.
											/////....OR......
*/
class Employee
{
	public int i;	
	public void display(int i)
	{
		this.i=i;	
		System.out.println(this.i);		
	}
}
class Developer extends Employee
{
	int i = 7;	
	public void display1(int i)
	{			    
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
class MainClassSuperkeyword
{ 
	
	public static void main(String[] args) 
	{
		
		System.out.println("main starts...");
		Developer d1 = new Developer();	
		d1.display(123);
		d1.display1(188);
		System.out.println("main ends...");
	}
}

/*
main starts...
123
7
123
main ends...
*/