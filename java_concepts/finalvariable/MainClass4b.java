/* 11 ANS //Non static  Refer Imp2 question for below program */
class MainClass4b
{
	public final int k;   //Non static 
	public MainClass4b()
	{
		k=10; 
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		MainClass4b rv = new MainClass4b();
		System.out.println(rv.k);
		System.out.println("main ends...");
	}
}
/*
main starts...
10
main ends...	            
*/