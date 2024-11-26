class Bridge
{
	public static int findTimeInSec(int distance, int speed) 
	{
		int timeInSec = distance/speed; //24
		return timeInSec;
		
	}
	public static void findTimeInMin(int distance, int speed, int timeInSec) 
	{
		double timeInMin = timeInSec/60.0;      //0.4
		System.out.println("A man walking @ the speed of "+speed+" m/sec will take "+timeInMin+" minutes to cross the bridge of "+distance+" meters length");
	}
	public static void main(String[] args) 
	{
		int result = findTimeInSec(120,5);
		findTimeInMin(120,5,result);
		
	}
}

/*
A man walking @ the speed of 5 m/sec will take 0.4 minutes to cross the bridge of 120 meters length
*/
