class Coach
{
	public void run()
	{
		System.out.println("run 5kms");
		//System.out.println("run 56kms");
	}
}
class Runner1 extends Coach
{
	{
		System.out.println("run 10kms");
		//System.out.println("run 59kms");
	}	
}
class Runner2 extends Coach
{		
}
class Runner3 extends Coach
{
	public void run()
	{
		System.out.println("run 2kms");
	}	
}
class MainClass3
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Runner1 r1 = new Runner1();
		r1.run();
		//Runner2 r2 = new Runner2();
		//r2.run();
		//Runner3 r3 = new Runner3();
		//r3.run();
		System.out.println("main ends...");
	}
}
/*
main starts...
run 10kms   //r1
run 5kms    //r1
run 5kms	//r2
run 2kms	//r3
main ends...
*/