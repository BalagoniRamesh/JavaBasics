class Circle 
{
	public int radius;
	public static double pi = 3.14;
	public Circle(int radius)
	{
		this.radius =radius;
	}
	public void findArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area of circle: "+area);
	}	
}
class CircleMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(4);
		c1.findArea();
		c2.findArea();
		c3.findArea();
		System.out.println("main ends...");

	}
}
/*
main starts...
Area of circle: 153.86
Area of circle: 314.0
Area of circle: 50.24
main ends...
*/