class Sample1 
{
	public static double i = 2.3;
	public static int j = 99;
	public int m = 10;
	public int n = 8;
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(i);
		System.out.println(j);
		Sample1 sample = new Sample1();
		System.out.println(sample.m);
		System.out.println(sample.n);
		System.out.println("main ends...");
	}
}

/*
main starts...
2.3
99
10
8
main ends...
*/