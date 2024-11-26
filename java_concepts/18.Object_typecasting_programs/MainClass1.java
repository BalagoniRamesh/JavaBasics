class Car
{
	public void move()
	{
		
	}	
}
class Honda extends Car
{
	public void keyStart()
	{
		System.out.println("Start Honda"); 
	}
}
class Audi extends Car
{
	public void buttonStart()
	{
		System.out.println("Start Audi"); 
	}
}
class MainClass1
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Car c1 =(Car) new Honda();
		c1.move();
		Honda h1 = (Honda) c1;
		h1.move();
		h1.keyStart();
		Car c2 =(Car) new Audi();
		c2.move();
		Audi a1 = (Audi) c2;		
		a1.move();
		a1.buttonStart();
		System.out.println("main ends...");
	}
}
/*
main starts...
Start Honda
Start Audi
main ends... 	
*/