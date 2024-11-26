interface Sample1
{
	abstract public void test1();
	
}
class Demo1 implements Sample1
{
	public void test1()
	{
		System.out.println("test1 completed");
	}
}
class MainClass1
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Demo1().test1();
		System.out.println("main ends...");
	}
}
/*
main starts...
test1 completed
main ends...                         
*/