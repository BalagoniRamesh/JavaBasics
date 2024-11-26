/* 10 ANS Refer Imp2 question for below program */
class MainClass3
{
	public final static int z;

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		z = 10;  // Error
		System.out.println(z);
		System.out.println("main ends...");
	}
}
/*
D:\java_programs\finalvariable\MainClass3.java:9: error: cannot assign a value to final variable z
                z = 10;  // Error
                ^
1 error                 
*/