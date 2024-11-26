class Run2 
{
	public void move()
	{
		System.out.println("move north");
	}	
}
interface Sample20
{
	public void move();	
}
class Demo11 extends Run2 implements Sample20
{
	/*public void test19()
	{
		System.out.println("test19 completed");
	}*/	
}
class MainClass10a
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Demo11().move();
		System.out.println("main ends...");
	}
}

/*
main starts...
move north
main ends...
*/