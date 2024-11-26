class Demo1 
{
	public static double a=2.1;
	public boolean z=true; 
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		int k = 56;
		System.out.println(k);
		System.out.println(a);
		Demo1 demo1 = new Demo1();
		System.out.println(demo1.z);
		System.out.println("main ends...");
	}
}

/*
main starts...
56
2.1
true
main ends...
*/