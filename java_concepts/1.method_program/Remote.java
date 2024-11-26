class Remote
{
	public static void changeChannel()
	{
		System.out.println("change from star maa to etv");
	}
	public void increaseVolume()
	{
		System.out.println("increase from 10% to 40%");
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
		changeChannel();
		Remote r1 = new Remote();
		r1.increaseVolume();
		System.out.println("main ends");

	}
}

/*
main starts
change from star maa to etv
increase from 10% to 40%
main ends
*/