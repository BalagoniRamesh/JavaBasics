class Shape
{
	public void rotate()
	{
		System.out.println("clock-wise");
	}
}
class Circle extends Shape
{	
}
class Rectangle extends Shape
{	
	public void rotate()
	{
		System.out.println("Anti-clock-wise");
	}
}
class Triangle extends Shape
{	
}
class MainClass8B
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Circle c1 = new Circle();
		c1.rotate();
		Rectangle r1 = new Rectangle();
		r1.rotate();
		Triangle t1 = new Triangle();
		t1.rotate();
		System.out.println("main ends...");
	}
}
/*
main starts...
clock-wise
Anti-clock-wise
clock-wise
main ends...
*/