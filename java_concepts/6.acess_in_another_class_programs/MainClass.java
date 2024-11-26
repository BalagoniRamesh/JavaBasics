class Cricket
{
	public static void play() 
	{
		System.out.println("play 2020 match");
	}
	public void replay() 
	{
		System.out.println("watch again");
	}
}
	
class MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Cricket.play();
		new Cricket().replay();
		System.out.println("main ends...");
	}
}

/*
main starts...
play 2020 match
watch again
main ends...
*/