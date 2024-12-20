abstract class Shape
{
	abstract public void getArea();
}
class Circle extends Shape
{
	public final static double pi = 3.14;
	public int r;
	public Circle(int r)
	{
		this.r = r;
	}
	public void getArea()
	{
		System.out.println("Area of Circle is: "+(pi*r*r)); 
	}
}
class Rect extends Shape
{
	public double length;
	public double width;
	public Rect(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public void getArea()
	{
		System.out.println("Area of Rect is: "+(length*width)); 
	}
}
class Tri extends Shape
{
	public int base;
	public int height;
	public Tri(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	public void getArea()
	{
		System.out.println("Area of Tri is: "+(0.5*base*height)); 
	}
}
class MainClass4
{ 
	public static void printArea(Shape shape)
	{
		shape.getArea();
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		printArea(new Circle(2));
		printArea(new Rect(10.3, 5.2));
		printArea(new Tri(12, 7));	
		System.out.println("main ends...");
	}
}
/*
main starts...
Area of Circle is: 12.56
Area of Rect is: 53.56
Area of Tri is: 42.0
main ends...
*/