class Vehicle
{
	public void start()
	{
		System.out.println("key start or start button");
	}
}
class Car extends Vehicle
{	
}
class Audi extends Car
{	
	public void start()
	{
		System.out.println("start button");
	}
}
class MainClass2
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Audi a1 = new Audi();
		a1.start();
		System.out.println("main ends...");
	}
}
/*
main starts...
start button
main ends...                           
*/