class Mobile 
{
	public  void playGames()
	{
	System.out.println("playing Game");
	}
	public  void message()
	{
	System.out.println("send message");
	}
   
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		Mobile m1=new Mobile();
		m1.playGames();		
		m1.message();
		System.out.println("main ends....");
	}
}
/*
main starts....
playing Game
send message
main ends....
*/