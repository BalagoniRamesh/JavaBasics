class TV
{
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		changeChannel(); 
		System.out.println("main ends...");
	}
	public static void changeChannel()
	{
		System.out.println("changeChannel starts");
		new TV().controlVolume();
		System.out.println("changeChannel ends");
	}
	public void controlVolume()
	{
		System.out.println("controlVolume starts");
		System.out.println("controlVolume ends");
	}
}
/*
main starts...
changeChannel starts
controlVolume starts
controlVolume ends
changeChannel ends
main ends...
*/