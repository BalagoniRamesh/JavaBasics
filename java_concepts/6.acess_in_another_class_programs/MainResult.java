class Result
{
	public static int k =100;
	public int i=6;
	public static void test()
	{
		System.out.println("test details");
	}
	public void main()
	{
		System.out.println("exam details");
	}
}
class MainResult
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(Result.k);
		Result result = new Result();
		System.out.println(result.i);
		Result.test();
		result.main();
		System.out.println("main ends...");
	}
}

/*
main starts...
100
6
test details
exam details
main ends...
*/