class Radio
{
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Radio().listenFM(98.3); 
		System.out.println("main ends...");
	}
	public  void listenFM(double frequency)
	{
		System.out.println("Listen to : "+frequency+" FM");
		changeFrequency(99.1);
	}
	public static void changeFrequency(double frequency)
	{
		System.out.println("change to : "+frequency+" FM");
	}
}
/*
main starts...
Listen to : 98.3 FM
change to : 99.1 FM
main ends...
*/