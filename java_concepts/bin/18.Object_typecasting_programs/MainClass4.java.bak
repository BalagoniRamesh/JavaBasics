interface Father
{
	void home();  //In interface all the methods by default public and abstract
}
class You implements Father
{
	public void home()
	{
		System.out.println("home color red"); 
	}
}
class MainClass4
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Father f1 =(Father) new You();
		f1.home();
		System.out.println("main ends...");
	}
}
/*
main starts...
home color red
main ends...
*/