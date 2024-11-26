class E
{
	public static int a = 10;
	public int b = 10;
}
class F extends E
{
	
	public void print()
	{
		System.out.println("Shared var a: "+a);
		System.out.println("Inherited var b: "+b);
	}
}
class MainClass7
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		F f1 = new F();
		F f2 = new F();
		F f3 = new F();
		F f4 = new F();
		f1.print();
		f2.print();
		f3.print();
		f4.print();
		System.out.println("main ends...");
	}
}
/*
main starts...
Shared var a: 10
Inherited var b: 10
Shared var a: 10
Inherited var b: 10
Shared var a: 10
Inherited var b: 10
Shared var a: 10
Inherited var b: 10
main ends...
*/