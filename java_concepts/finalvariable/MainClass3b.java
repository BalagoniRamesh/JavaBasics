/* 10 ANSRefer Imp2 question for below program */
class MainClass3b
{
	public final static int z;
	public MainClass3b()
	{
		z=10; // Error
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(z);
		System.out.println("main ends...");
	}
}
/*
D:\java_programs\finalvariable\MainClass3b.java:7: error: cannot assign a value to final variable z
                z=10;
                ^
1 error                 
*/