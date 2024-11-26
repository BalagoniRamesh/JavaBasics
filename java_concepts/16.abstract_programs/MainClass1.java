abstract class Demo
{
	abstract public void test();
}
class Sample extends Demo
{
	public void test()
	{
		System.out.println("test completed");
	}
}
class MainClass1
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Sample().test();
		System.out.println("main ends...");
	}
}
/*
main starts...
test completed
main ends...                         
*/