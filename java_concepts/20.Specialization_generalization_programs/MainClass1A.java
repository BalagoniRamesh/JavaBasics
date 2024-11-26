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
class MainClass1A
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Book b1 = new Book("JAVA");
		Book b2 = new Book("SQL");
		Book b3 = new Book("WEB");
		b1.write();
		b1.read();
		b2.write();
		b2.read();
		b3.write();
		b3.read();
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