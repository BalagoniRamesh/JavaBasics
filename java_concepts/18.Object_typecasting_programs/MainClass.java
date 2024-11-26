class A
{
	public void wings()
	{
		System.out.println("use wings"); 
	}
}
class B extends A
{
	public void wheels()
	{
		System.out.println("use wheels"); 
	}
}
class MainClass
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		A a1 =(A) new B();
		a1.wings();
		B b1 =(B) a1;
		b1.wings();
		b1.wheels();
		System.out.println("main ends...");
	}
}
/*
main starts...
use wings
use wings
use wheels
main ends...                     
*/