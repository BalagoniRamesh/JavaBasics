class A 
{
	public int i = 10;
}
class B extends A
{
	public int z = 10;
	public void display()
	{
		System.out.println("Inheritance var i: "+i);
		System.out.println("Own var z: "+z);

	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		B b1 = new B();
		b1.display();
		System.out.println("main ends...");
	}
}

/*
main starts...
Inheritance var i: 10
Own var z: 10
main ends...
*/