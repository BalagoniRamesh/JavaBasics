interface Sample7
{
	public void test7();	
}
interface Sample8 extends Sample7
{
	public void test8();	
}
interface Sample9 extends Sample7
{
	public void test9();	
}
class Demo4 implements Sample8
{
	public void test7()
	{
		System.out.println("test7 completed");
	}
	public void test8()
	{
		System.out.println("test8 completed");
	}
}
class Demo5 implements Sample9
{
	public void test7()
	{
		System.out.println("test7 completed");
	}
	public void test9()
	{
		System.out.println("test9 completed");
	}
}
class MainClass4
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo4 rv1 = new Demo4();
		Demo5 rv2 = new Demo5();
		rv1.test7();
		rv1.test8();
		rv2.test7();
		rv2.test9();
		System.out.println("main ends...");
	}
}

/*
main starts...
test7 completed
test8 completed
test7 completed
test9 completed
main ends...                      
*/