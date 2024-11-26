interface Sample16
{
	public void walk();	
}
interface Sample17
{
	public void walk();	
}
interface Sample18 extends Sample16, Sample17
{
	public void walk();
}
class Demo9 implements Sample18
{
	public void walk()
	{
		System.out.println("walk completed");
	}	
}
class MainClass8
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Demo9().walk();
		System.out.println("main ends...");
	}
}

/*
main starts...
walk completed
main ends...
*/