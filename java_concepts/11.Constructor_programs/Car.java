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
