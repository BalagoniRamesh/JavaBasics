class Run 
{
	public int z =89;

	public void result()
	{
		int z = 12;
		System.out.println(z);
		System.out.println(this.z);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Run run = new Run();
		run.result();
		System.out.println("main ends...");
	}
}
/*
main starts...
12
89
main ends...
*/ 