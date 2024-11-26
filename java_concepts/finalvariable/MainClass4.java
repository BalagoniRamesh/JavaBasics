/* 11 ANS //Non static  Refer Imp2 question for below program */
class MainClass4
{
	public final int k;   //Non static 

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		MainClass4 rv = new MainClass4();
		rv.k=20;
		System.out.println("main ends...");
	}
}
/*
D:\java_programs\finalvariable\MainClass4.java:10: error: cannot assign a value to final variable k
                rv.k=20;
                  ^
1 error              
*/