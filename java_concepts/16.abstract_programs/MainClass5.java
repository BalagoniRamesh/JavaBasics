abstract class Vehicle
{
	abstract public void engine();
	abstract public void gear();
}
abstract class Bike extends Vehicle
{
	public void engine()
	{
		System.out.println("complete engine"); 
	}
}
class RoyalEnfield extends Bike
{
	public void gear()
	{
		System.out.println("complete gear"); 
	}
}
class MainClass5
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		RoyalEnfield re = new RoyalEnfield();
		re.engine();
		re.gear();
		System.out.println("main ends...");
	}
}
/*
main starts...
complete engine
complete gear
main ends...                         
*/