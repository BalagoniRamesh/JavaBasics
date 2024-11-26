class Calender1 //program with Encapsulation
{
	private int monthNumber;
	public void givenMonthNumber(int monthNumber)
	{
		if(monthNumber >= 1 && monthNumber <= 12)
		{
			this.monthNumber = monthNumber;
		}
		else
		{
			System.err.println("Invalid monthNumber");
		}
	}
	public void printMonthName()
	{
	  switch(monthNumber)
	  {
		case 1 : System.out.println("JAN");
		break;
		case 2 : System.out.println("FEB");
		break;
		case 3 : System.out.println("MAR");
		break;
		case 4 : System.out.println("APR");
		break;
		case 5 : System.out.println("MAY");
		break;
		case 6 : System.out.println("JUN");
		break;
		case 7 : System.out.println("JULY");
		break;
		case 8 : System.out.println("AUG");
		break;
		case 9 : System.out.println("SEP");
		break;
		case 10 : System.out.println("OCT");
		break;
		case 11 : System.out.println("NOV");
		break;
		case 12 : System.out.println("DEC");
		break;
	 }
	}
}
class MainClass2
{
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		Calender1 c1 = new Calender1();
		c1.givenMonthNumber(4);
		c1.printMonthName();
		System.out.println("main ends....");
	}
}
/*
main starts....
APR
main ends....
*/