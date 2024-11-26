/* 11 ANS //Non static  Refer Imp2 question for below program */
class MainClass4a
{
	public final int k = 10;   //Non static 

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		MainClass4a rv = new MainClass4a();
		System.out.println(rv.k);
		System.out.println("main ends...");
	}
}
/*
main starts...
10
main ends...               
*/