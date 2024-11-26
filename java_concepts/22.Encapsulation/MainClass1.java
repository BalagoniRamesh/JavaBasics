class Calender //program with Encapsulation
{
	public int monthNumber;
}
class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		Calender c1 = new Calender();
		c1.monthNumber = 100;
		System.out.println("main ends....");
	}
	public static void display()
	{
	System.out.println("display tv");
	}

}
/*
main starts....
main ends....
*/