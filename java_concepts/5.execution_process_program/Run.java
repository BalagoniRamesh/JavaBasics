class Run 
{
		public void walk() 
	{
		System.out.println("walk 1 km");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Run run = new Run();
		run.walk();
		System.out.println("main ends...");
	}
}

/*
main starts...
walk 1 km
main ends...
*/