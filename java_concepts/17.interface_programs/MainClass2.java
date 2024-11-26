interface Sample2
{
	public void test2();
	
}
interface Sample3 extends Sample2
{
	public void test3();	
}
class Demo2 implements Sample3
{
	public void test2()
	{
		System.out.println("test2 completed");
	}
	public void test3()
	{
		System.out.println("test3 completed");
	}
}
class MainClass2
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo2 rv = new Demo2();
		rv.test2();
		rv.test3();
		System.out.println("main ends...");
	}
}

/*
main starts...
test2 completed
test3 completed
main ends...                         
*/