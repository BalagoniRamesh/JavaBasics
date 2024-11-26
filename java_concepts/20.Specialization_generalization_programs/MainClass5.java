class Addition
{
	public static void add(int i, int j)
	{
		System.out.println(i+j); 
	}
	public static void add(double i, int j)
	{
		System.out.println(i+j); 
	}
	public static void add(int i, int j, int k)
	{
		System.out.println(i+j+k); 
	}
}	
class MainClass5
{ 
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Addition.add(5, 2, 7);
		Addition.add(4.6, 6);
		Addition.add(9, 3);	
		System.out.println("main ends...");
	}
}
/*
main starts...
14
10.6
12
main ends...
*/