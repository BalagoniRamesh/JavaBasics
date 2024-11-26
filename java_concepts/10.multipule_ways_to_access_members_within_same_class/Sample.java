class Sample 
{
	public int z =20;

	public void result()
	{
		System.out.println(z);
		System.out.println(this.z);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Sample sample1 = new Sample();
		Sample sample2 = new Sample();
		Sample sample3 = new Sample();
		sample1.result();
		sample2.result();
		sample3.result();
		System.out.println("main ends...");
	}
}
/*
main starts...
20
20
20
20
20
20
main ends...
*/ 