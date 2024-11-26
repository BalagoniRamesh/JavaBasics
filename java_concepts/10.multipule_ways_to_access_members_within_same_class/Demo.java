class Demo 
{
	public static int a =100;

	public static void display()
	{
		System.out.println(a);
		System.out.println(Demo.a);
		Demo demo = new Demo();
		System.out.println(demo.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		display();
		System.out.println("main ends...");
	}
}
/*
main starts...
100
100
100
main ends...
*/ 