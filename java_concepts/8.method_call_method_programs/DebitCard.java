class DebitCard
{
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new DebitCard().withdraw(); //second way to create object
		System.out.println("main ends...");
	}
	public void withdraw()
	{
		System.out.println("withdraw starts");
		changePin();
		System.out.println("withdraw ends");
	}
	public void changePin()
	{
		System.out.println("changePin starts");
		System.out.println("changePin ends");
	}
}

/*
main starts...
withdraw starts
changePin starts
changePin ends
withdraw ends
main ends...
*/