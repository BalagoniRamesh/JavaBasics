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
class StudentMainClass
{

	public static void main(String[] args)
	{
		System.out.println("main starts...");
		Student s1 = new Student("Varshith", 80, 93.3, 62, 72);
		s1.display();
		Student s2 = new Student("Sandeep", 82, 62, 56);
		s2.display();
		System.out.println("main ends...");
	}
}
/*
main starts...
********************
Name: Varshith
tenth percentage: 80.0%
inter percentage: 93.3%
degree percentage: 62.0%
masters percentage: 72.0%
********************
********************
Name: Sandeep
tenth percentage: 82.0%
inter percentage: 62.0%
degree percentage: 56.0%
********************
main ends...
*/