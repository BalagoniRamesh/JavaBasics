class Demo 
{
	public Demo(int a)
	{
		System.out.println("Execute Demo constructor with int arg");
		System.out.println("a : " +a);
	}
	public Demo(double a) /* this a local to this method */
	{
		System.out.println("Execute Demo constructor with double arg");
		System.out.println("a : " +a);
	}
	public Demo(String i, boolean j) 
	{
		System.out.println("Execute Demo constructor with Sting,double arg");
		System.out.println("i : " +i);
		System.out.println("j : " +j);
	}
}

class DemoMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo d1 = new Demo(3);
		Demo d2 = new Demo(4.3);
		Demo d3 = new Demo("Hi", true);
		Demo d4 = new Demo("Hi", false); //optional we create n-number of objects */
		System.out.println("main ends...");
	}
}
/*
ain starts...
Execute Demo constructor with int arg
a : 3
Execute Demo constructor with double arg
a : 4.3
Execute Demo constructor with Sting,double arg
i : Hi
j : true
Execute Demo constructor with Sting,double arg
i : Hi
j : false
main ends...
*/