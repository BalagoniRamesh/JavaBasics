class sample
{

	public static void main(String[] args)
	{
		System.out.println("main starts");
		int k=10;
		System.out.println(k);
		display();
		sample s1 = new sample();
		s1.result();
		System.out.println("main ends");
	}
	public static void display()
	{
		System.out.println("display starts....");
		double z=5.4;
		System.out.println(z);
		System.out.println("display ends....");
	}
	public void result()
	{
		System.out.println("result starts....");
		boolean i = true;
		System.out.println(i);
		System.out.println("result ends....");
	}
}

/*
main starts
10
display starts....
5.4
display ends....
result starts....
true
result ends....
main ends
*/