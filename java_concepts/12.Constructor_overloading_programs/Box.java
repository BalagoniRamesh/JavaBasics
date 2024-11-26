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
