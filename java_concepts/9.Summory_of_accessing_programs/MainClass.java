class Car
{
	
	public static String brandName ="Audi";
	public int topSpeed = 298;
	
	public static void move() 
	{
		System.out.println("move forward");
		System.out.println(brandName);
	}
	public void hitBrake() 
	{
		System.out.println("car stops");
		System.out.println(topSpeed);
	}
}
class Driver
{
	public static void drive()
	{
		System.out.println("drive any car");
		Car.move();
	}
	public void race() 
	{
		System.out.println("race for 20kms");
		new Car().hitBrake();
	}
}
class MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Driver.drive();
		new Driver().race();
		System.out.println("main ends...");
	}
}	

/*
main starts...
drive any car
move forward
Audi
race for 20kms
car stops
298
main ends...
*/