class Test1 
{
	public static int i=76;
	public int j=33; 
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(i);
		Test1 rv1 = new Test1();
		Test1 rv2 = new Test1();
		Test1 rv3 = new Test1();
		System.out.println(rv1.j);
		System.out.println(rv2.j);
		System.out.println(rv3.j);		
		System.out.println("main ends...");
	}
}

/*
main starts...
76
33
33
33
main ends...
*/