interface Sample10
{
	public void test10();	
}
interface Sample11
{
	public void test11();	
}
interface Sample12 extends Sample10, Sample11
{
	public void test12();	
}
class Demo6 implements Sample12
{
	public void test10()
	{
		System.out.println("test10 completed");
	}
	public void test11()
	{
		System.out.println("test11 completed");
	}
	public void test12()
	{
		System.out.println("test12 completed");
	}
}
class MainClass5
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo6 rv = new Demo6();		
		rv.test10();
		rv.test11();
		rv.test12();
		System.out.println("main ends...");
	}
}

/*
main starts...
test10 completed
test11 completed
test12 completed
main ends...
*/