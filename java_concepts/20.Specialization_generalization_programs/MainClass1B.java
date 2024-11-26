class Book
{
	public String bName;
	public Book(String bName)
	{
		this.bName = bName;
	}
	public void write()
	{
		System.out.println("write: "+bName); 
	}
	public void read()
	{
		System.out.println("read: "+bName); 
	}
}
class MainClass1B
{ 
	public static void exam(Book book)
	{
		book.write();
		book.read();
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		exam(new Book("JAVA"));
		exam(new Book("SQL"));
		exam(new Book("WEB"));		
		System.out.println("main ends...");
	}
}
/*
main starts...
write: JAVA
read: JAVA
write: SQL
read: SQL
write: WEB
read: WEB
main ends...
*/