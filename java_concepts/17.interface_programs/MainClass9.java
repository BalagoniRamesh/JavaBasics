class Run1 
{
	public void cycle()
	{
		System.out.println("cycle 5km");
	}	
}
interface Sample19
{
	public void test19();	
}
class Demo10 extends Run1 implements Sample19
{
	public void test19()
	{
		System.out.println("test19 completed");
	}	
}
class MainClass9
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo10 rv = new Demo10();
		rv.cycle();
		rv.test19();
		System.out.println("main ends...");
	}
}

/*
main starts...
cycle 5km
test19 completed
main ends...
*/