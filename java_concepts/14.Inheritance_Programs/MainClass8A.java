class Circle
{
	public void rotate()
	{
		System.out.println("clock-wise");
	}
}
class Rectangle
{
	public void rotate()
	{
		System.out.println("clock-wise");
	}
}
class Triangle
{
	public void rotate()
	{
		System.out.println("clock-wise");
	}
}
class MainClass8A
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
clock-wise
clock-wise
main ends...
*/