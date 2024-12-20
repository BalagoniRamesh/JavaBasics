abstract class Animal
{
	abstract public void hunt();
	abstract public void roam();
}
class Lion extends Animal
{
	public void hunt()
	{
		System.out.println("hunt for food");
	}
	public void roam()
	{
		System.out.println("roam around forest");		
	}
}
class MainClass2
{ 	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Lion l1 = new Lion();
		l1.hunt();
		l1.roam();
		System.out.println("main ends...");
	}
}
/*
main starts...
hunt for food
roam around forest
main ends...                           
*/