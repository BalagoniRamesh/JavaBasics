class Developer
{
	String id;
	String name;
	double salary;
	String lang;
	public Developer(String id, String name, double salary, String lang)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.lang=lang;
	}
	public void developerInfo()
	{
		System.out.println("***********************");
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Language : "+lang);
   }
}
