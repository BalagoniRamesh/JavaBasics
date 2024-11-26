class Book
{
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		read(); 
		System.out.println("main ends...");
	}
	public static void read()
	{
		System.out.println("read starts");
		write();
		System.out.println("read ends");
	}
	public static void write()
	{
		System.out.println("write starts");
		System.out.println("write ends");
	}
}

/*
main starts...
read starts
write starts
write ends
read ends
main ends...
*/