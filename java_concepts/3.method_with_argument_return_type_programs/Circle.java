class Circle //pascal casing
{
	public void findRadius(double diameter) //camel casing
	{
		double radius = diameter/2;
		System.out.println("Given Diameter is: " +diameter);
		System.out.println("Radius of circle is: " +radius);
	}
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		Circle circle = new Circle();
		circle.findRadius(12.6);
		System.out.println("main ends...");
	}
}

/*
main starts...
Given Diameter is: 12.6
Radius of circle is: 6.3
main ends...
*/