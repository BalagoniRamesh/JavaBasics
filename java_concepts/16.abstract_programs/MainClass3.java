abstract class Car
{
	public void changeGear()
	{
		System.out.println("change gear based on speed");
	}
	abstract public void turnOnLights();
}
class Benz extends Car
{
	public void turnOnLights()
	{
		System.out.println("turn on lights during night journey");
	}
}
class MainClass3
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Benz b1 = new Benz();
		b1.changeGear();
		b1.turnOnLights();
		System.out.println("main ends...");
	}
}
/*
main starts...
change gear based on speed
turn on lights during night journey
main ends...                          
*/