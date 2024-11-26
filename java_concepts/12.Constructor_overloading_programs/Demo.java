class Demo 
{
	public Demo(int a)
	{
		System.out.println("Execute Demo constructor with int arg");
		System.out.println("a : " +a);
	}
	public Demo(double a) /* this a local to this method */
	{
		System.out.println("Execute Demo constructor with double arg");
		System.out.println("a : " +a);
	}
	public Demo(String i, boolean j) 
	{
		System.out.println("Execute Demo constructor with Sting,double arg");
		System.out.println("i : " +i);
		System.out.println("j : " +j);
	}
}
