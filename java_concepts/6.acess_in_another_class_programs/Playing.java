class Cricket1
{
	public static void overs()
	{
		System.out.println("Enter number of overs");
	}
	public  void runs()
	{
		System.out.println("number of scores");
	}
}
class VolleyBall
{
	public static int k =8;
	public int j=9;
}	
class Playing
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Cricket1.overs();
		Cricket1 cricket1 = new Cricket1();
		cricket1.runs();
		System.out.println(VolleyBall.k);
		VolleyBall volleyball = new VolleyBall();
		System.out.println(volleyball.j);
		System.out.println("main ends...");
	}
}

/*
main starts...
Enter number of overs
number of scores
8
9
main ends...
*/