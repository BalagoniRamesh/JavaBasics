class Test2
{

	public static String a ="#";
	public boolean b = false;
	public static void result()
	{
		char ch ='@';
		System.out.println(ch);
	}

	public  void print()
	{
		String str ="hi";
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		System.out.println(a);
		Test2 t1 = new Test2();
		System.out.println(t1.b);
		result();
		t1.print();
		System.out.println("main ends....");
	}

}

/*
main starts...
#
false
@
hi
main ends....
*/