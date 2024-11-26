class Student 
{
	public String name;
	public double tength;
	public double inter;
	public double degree;
	public double masters;
	public Student(String name, double tength, double inter, double degree, double masters)
	{
		this.name = name;
		this.tength = tength;
		this.inter = inter;
		this.degree = degree;
		this.masters = masters;
	}
	public Student(String name, double tength, double inter, double degree)
	{
		this.name = name;
		this.tength = tength;
		this.inter = inter;
		this.degree = degree;
	}
	public void display()
	{
		System.out.println("********************");
		System.out.println("Name: "+name);
		System.out.println("tenth percentage: "+tength+"%");
		System.out.println("inter percentage: "+inter+"%");
		System.out.println("degree percentage: "+degree+"%");
		if(masters!=0.0)
		{
		System.out.println("masters percentage: "+masters+"%");
		}
		System.out.println("********************");
	
	}
}
