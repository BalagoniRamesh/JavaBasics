interface Sample4
{
	public void test4();	
}
interface Sample5 extends Sample4
{
	public void test5();	
}
interface Sample6 extends Sample5
{
	public void test6();	
}
class Demo3 implements Sample6
{
	public void test4()
	{
		System.out.println("test4 completed");
	}
	public void test5()
	{
		System.out.println("test5 completed");
	}
	public void test6()
	{
		System.out.println("test6 completed");
	}
}
class MainClass3
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo3 rv = new Demo3();
		rv.test4();
		rv.test5();
		rv.test6();
		System.out.println("main ends...");
	}
}

/*
main starts...
test4 completed
test5 completed
test6 completed
main ends...                        
*/