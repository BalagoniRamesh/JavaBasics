class Demo
{
	public void move()
	{
		System.out.println("move north");
	}
}
class Sample extends Demo
{
	public void move()
	{
		System.out.println("move south");
	}	
}

class MainClass
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Sample s1 = new Sample();
		s1.move();
		System.out.println("main ends...");
	}
}
/*
main starts...
move south
main ends...                        
*/