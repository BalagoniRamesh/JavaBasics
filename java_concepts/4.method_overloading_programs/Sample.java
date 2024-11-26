class Sample 
{
	public static void move(int i,int j) 
	{
		System.out.println("Inside move method with int,int,arg");
	}
	public static void move(double i,double j) 
	{
		System.out.println("Inside move method with double,double,arg");
	}
	public static void move(int i,int j, int k) 
	{
		System.out.println("Inside move method with int,int,int arg");
	}
	public static void move(double i,int j) 
	{
		System.out.println("Inside move method with double, int arg");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		move(1, 2);
		move(1.2, 2.4);
		move(1, 2,3);
		move(3.4, 7);
		System.out.println("main ends...");
	}
}
/*
main starts...
Inside move method with int,int,arg
Inside move method with double,double,arg
Inside move method with int,int,int arg
Inside move method with double, int arg
main ends...
*/