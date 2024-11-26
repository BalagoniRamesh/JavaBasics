class Rectangle
{
	public void calculateArea(int length, double width)
	{
		double area = length*width;
		System.out.println("**********Rectangle Details************");
		System.out.println("Length: " +length);	
		System.out.println("Width: " +width);
		System.out.println("Area: " +area);
		System.out.println("**********************");
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
		Rectangle rectangle = new Rectangle();
		rectangle.calculateArea(12,4.3);
		System.out.println("main ends");
	}
}

/*
main starts
**********Rectangle Details************
Length: 12
Width: 4.3
Area: 51.599999999999994
**********************
main ends
*/