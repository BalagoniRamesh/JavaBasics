class Test 
{
	public static void main(int i) 
	{
		System.out.println("Inside main method with int arg");
	}
	public static void main(double i) 
	{
		System.out.println("Inside main method with double arg");
	}
	public static void main(String[] args) 
	{
		System.out.println("Inside main method with string[] arg");
		main(100);
		Test test = new Test();
		test.main(8.7);
	}
}

/*
Inside main method with string[] arg
Inside main method with int arg
Inside main method with double arg
*/