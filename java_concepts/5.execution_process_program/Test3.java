class Test3 
{
	public static void move() 
	{
		int i=1;
		System.out.println(i);
	}
	public static void walk() 
	{
		int j=2;
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		move();
		Test3 test = new Test3();
		Test3.walk(); 
		System.out.println("main ends...");
	}
}
/*
main starts...
1
2
main ends...
*/