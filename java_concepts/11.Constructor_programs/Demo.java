class Demo 
{
	public Demo()
	{
	System.out.println("Execute constructer without arguments");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();		
		System.out.println("main ends...");
	}
}
/*
main starts...
Execute constructer without arguments
Execute constructer without arguments
Execute constructer without arguments
Execute constructer without arguments
main ends...
*/