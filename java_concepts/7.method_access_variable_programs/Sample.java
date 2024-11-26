class Sample
{
	public int k =8;
	public void test()
	{
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Sample sample = new Sample();
		sample.test();
		System.out.println("main ends...");
	}
}

/*
main starts...
8
main ends...
*/