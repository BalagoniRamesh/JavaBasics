abstract class Mobile
{
	public void call()
	{
		System.out.println("call dad"); 
	}
	abstract public void msg();
}
abstract class Samsung extends Mobile
{
	public void call()
	{
		System.out.println("call mom"); 
	}
}
class SamsungGalaxy extends Samsung
{
	public void msg()
	{
		System.out.println("msg friend"); 
	}
}
class MainClass6
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		SamsungGalaxy sg = new SamsungGalaxy();
		sg.call();
		sg.msg();
		System.out.println("main ends...");
	}
}
/*
main starts...
call mom
msg friend
main ends...                        
*/