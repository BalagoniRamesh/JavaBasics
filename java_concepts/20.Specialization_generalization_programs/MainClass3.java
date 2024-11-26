interface Animal //Runtime polymopism
{
	void noise();
}
class Lion implements Animal
{
	public void noise()
	{
		System.out.println("Lion roars"); 
	}
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("dog boarks"); 
	}
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("cat maow"); 
	}
}
class MainClass3
{ 	
	public static void makeSound(Animal a)
	{
		a.noise();
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		makeSound(new Dog());
		makeSound(new Lion());
		makeSound(new Cat());
		System.out.println("main ends...");
	}
}
/*
main starts...
dog boarks
Lion roars
cat maow
main ends...
*/