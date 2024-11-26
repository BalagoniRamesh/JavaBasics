class Circle1
{
	public static double findRadius(double diameter)
	{
		double radius = diameter/2;
		return radius;
	}
	public static void findArea(double radius)
	{
		double area =3.14*radius*radius;
		System.out.println("Area of circle: " +area);
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
		double result = findRadius(12.6);
		findArea(result);
		System.out.println("main ends");
	}
}

/*
main starts
Area of circle: 124.6266
main ends
*/