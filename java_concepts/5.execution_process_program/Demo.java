class Demo 
{
	public static int a = 12;
	public int b = 65;
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(a);
		Demo demo = new Demo();
		System.out.println(demo.b);
		System.out.println("main ends...");
	}
}

/*
main starts...
12
65
main ends...
*/