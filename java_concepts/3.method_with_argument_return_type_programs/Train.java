class Train
{
	public static double speedmSec(double speed) 
	{
		double speedmSec=speed*1000/3600; 
		return speedmSec;
	}
	public static void lengthOfTrain(int time, double speed) 
	{
		double distance=speed*time; 
		System.out.println("A train of length "+distance+" meters will take "+time+" seconds to cross the electricity pole. If the train moves at the speed of "+speed+" m/sec");
	}
	public static void main(String[] args) 
	{
		double result = speedmSec(60);
		lengthOfTrain(9, result);
	}
}

/*

A train of length 150.0 meters will take 9 seconds to cross the electricity pole. If the train moves at the speed of 16.666666666666668 m/sec
*/
