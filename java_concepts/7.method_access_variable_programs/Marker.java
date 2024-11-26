class Marker
{
	public int i =7;
	public static void fillInk() 
	{
		Marker marker = new Marker();
		System.out.println(marker.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		fillInk();
		System.out.println("main ends...");
	}
}

/*
main starts...
7
main ends...
*/