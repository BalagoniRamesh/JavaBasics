class Music 
{
	public static int i =44;
	public static void music(int i) 
	{
		System.out.println("play music");
		System.out.println(i);
		System.out.println(Music.i);

	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		music(45);
		System.out.println("main ends");
	}
}
/*
main starts
play music
45
44
main ends
*/