class Testing
{
	String id;
	String name;
	double salary;
	String typeOfTesting;
	public Testing(String id, String name, double salary, String typeOfTesting)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.typeOfTesting=typeOfTesting;
	}
	public void testEngDetails()
	{
		System.out.println("***********************");
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Type Of testing : "+typeOfTesting);
   }
}
