abstract class Book
{
	abstract public void write();
}
class Academic extends Book
{
	public void write()
	{
		System.out.println("write sql book"); 
	}
}
class Biography extends Book
{
	public void write()
	{
		System.out.println("wings of fire"); 
	}
}
class MainClass4
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Academic().write();
		new Biography().write();
		System.out.println("main ends...");
	}
}
/*
main starts...
write sql book
wings of fire
main ends...                         
*/