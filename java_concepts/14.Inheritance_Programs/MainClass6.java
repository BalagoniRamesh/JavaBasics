class Test
{
	public void walk()
	{
		System.out.println("walk 10km");
	}
}
class Demo1 extends Test
{
	
	public String i = "north";
	public void trip()
	{
		System.out.println(i);
		walk();
	}
}
class Demo2 extends Test
{
	
	public String j = "south";
	public void race()
	{
		System.out.println(j);
		walk();
	}
}
class Demo3 extends Test
{
	
	public String k = "east";
	public void swim()
	{
		System.out.println(k);
		walk();
	}
}
class MainClass6
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new Demo1().trip();
		new Demo2().race();
		new Demo3().swim();
		System.out.println("main ends...");
	}
}
/*
main starts...
north
walk 10km
south
walk 10km
east
walk 10km
main ends...
*/