class Student 
{
	public String name;
	public double tength;
	public double inter;
	public double degree;
	public double masters;
	public Student(String name, double tength, double inter, double degree, double masters)
	{
		this(name, tength, inter, degree);
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
		Student s1 = new Student("Abhi", 78.5, 56.7, 62.3);
		Student s2 = new Student("Raj", 87.4, 42.1, 83.2);
		Student s3 = new Student("Vijay", 76.3, 64.1, 76.4, 64.3);		
		s1.display();		
		s2.display();
		s3.display();
		System.out.println("main ends...");
	}
}
/*
main starts...
********************
Name: Abhi
tenth percentage: 78.5%
inter percentage: 56.7%
degree percentage: 62.3%
********************
********************
Name: Raj
tenth percentage: 87.4%
inter percentage: 42.1%
degree percentage: 83.2%
********************
********************
Name: Vijay
tenth percentage: 76.3%
inter percentage: 64.1%
degree percentage: 76.4%
masters percentage: 64.3%
********************
main ends...
*/