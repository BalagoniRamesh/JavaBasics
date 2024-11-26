interface Sample13
{
	public void test13();	
}
interface Sample14
{
	public void test14();	
}
class Demo7 implements Sample14, Sample13
{
	public void test13()
	{
		System.out.println("test13 completed");
	}
	public void test14()
	{
		System.out.println("test14 completed");
	}
}
class MainClass6
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo7 rv = new Demo7();		
		rv.test13();
		rv.test14();
		System.out.println("main ends...");
	}
}

/*
main starts...
test13 completed
test14 completed
main ends...
*/