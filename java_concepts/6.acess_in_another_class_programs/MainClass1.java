class Student
{
	public static int k =8;
	public static void name()
	{
		System.out.println("Enter student name details");
	}
}
class College
{
	public double i=8.8;
	public  void collegeName()
	{
		System.out.println("Enter College Name");
	}
}
class VolleyBall
{
	public static int k =8;
	public int j=9;
}	
class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(Student.k);
		Student.name();
		College college = new College();
		System.out.println(college.i);
		college.collegeName();
		System.out.println("main ends...");
	}
}

/*
main starts...
8
Enter student name details
8.8
Enter College Name
main ends...
*/