abstract class Sample15
	{
		abstract public void test15();	
	}
interface Sample16
	{
		public void test16();	
	}

class Demo8 extends Sample15 implements Sample16 
{
	public void test15()
	{
		System.out.println("test15 completed");
	}
	public void test16()
	{
		System.out.println("test16 completed");
	}
 }

class MainClass7
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo8 rv = new Demo8();		
		rv.test15();
		rv.test16();
		System.out.println("main ends...");
	}
}

/*
main starts...
test15 completed
test16 completed
main ends...
*/