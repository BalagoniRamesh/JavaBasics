class Laptop
{
	public static double k=8.8;
	public void display()
	{
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Laptop laptop = new Laptop();
		laptop.display();
		System.out.println("main ends...");
	}
}

/*
main starts...
8.8
main ends...
*/