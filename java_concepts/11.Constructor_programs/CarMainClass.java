class Car 
{
	public static String brandName ="AUDI";
	public int speed;
	public int time;
	public static String destination ="HYD";
	public Car(int speed, int time)

	{
		this.speed = speed;
		this.time = time;

	}
	public void calculateDistance()
	{
		int distance = speed*time;
		System.out.println(brandName+" car travel @ "+
							speed+" km/hr and it has taken "+	
							time+" hrs to reach destination "+
							destination+" of "+
							distance+" kms");
	}	
}
class CarMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Car c1 = new Car(200, 3);
		Car c2 = new Car(300, 2);
		c1.calculateDistance();
		c2.calculateDistance();
		System.out.println("main ends...");		
	}
}

/*
main starts...
AUDI car travel @ 200 km/hr and it has taken 3 hrs to reach destination HYD of 600 kms
AUDI car travel @ 300 km/hr and it has taken 2 hrs to reach destination HYD of 600 kms
main ends...
*/