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
