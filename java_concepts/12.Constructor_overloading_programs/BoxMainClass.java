class Box 
{
	public int length;
	public int width;
	public int Height;
	
	public Box(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	public Box(int length, int width, int Height)
	{
		this.length = length;
		this.width = width;
		this.Height = Height;
	}
	public void display2Dimention()
	{
		System.out.println("********2D dimention************");
		System.out.println("[length : "+length+", width : "+width+ "]");
	}
	public void display3Dimention()
	{
		System.out.println("********3D dimention************");
		System.out.println("[length : "+length+", width : "+width+", Height : "+Height+ "]");
	}
	public void printDimension()
	{
		if(Height!=0) //int default value "0"
		{
			display3Dimention();
		}
		else
			{
			display2Dimention();
		}
	}
}
class BoxMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Box b1 = new Box(10,4,6);
		Box b2 = new Box(21,13,18);
		Box b3 = new Box(8,4);
		b1.printDimension();
		b2.printDimension();
		b3.printDimension();
		System.out.println("main starts...");
	}
}
/*
main starts...
********3D dimention************
[length : 10, width : 4, Height : 6]
********3D dimention************
[length : 21, width : 13, Height : 18]
********2D dimention************
[length : 8, width : 4]
main starts...
*/