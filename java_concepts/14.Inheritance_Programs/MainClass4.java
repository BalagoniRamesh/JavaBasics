class Sample
{
	public String greetings = "Party";
}
class Demo extends Sample 
{
	public void invite()
	{
		System.out.println(greetings);
	}
}
class Run extends Demo
{
    public void function()
	{
	invite();
	}
}
class MainClass4
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Run r1 = new Run();
		r1.function();
		System.out.println("main ends...");
	}
}
/*
main starts...
Party
main ends...
*/