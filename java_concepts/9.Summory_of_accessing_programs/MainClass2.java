class Player 
{
	public static String firstName = "RAJ";
	public  String lastName = "Benj";
}
class Volleyball
{
	public static void pass()
	{
	System.out.println("pass the ball");
	System.out.println(Player.firstName);

	}
	public void smash()
	{
	System.out.println("smash the ball");
	System.out.println(new Player().lastName);
	}
}

class Match
{ 
	public void play()
	{
		System.out.println("play volleyball match");
		Volleyball.pass();
		new Volleyball().smash();
	}
}
class MainClass2
{ 
	public static void watchGame()
	{
		System.out.println("watch volleyball game");
		new Match().play();
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		watchGame();
		System.out.println("main ends");
	}
	
}
/*
main starts
watch volleyball game
play volleyball match
pass the ball
RAJ
smash the ball
Benj
main ends
*/
