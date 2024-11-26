class Sample 
{
	public Sample(int z)
	{
	System.out.println("Execute constructer with int argument z : "+z);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Sample s1 = new Sample(66);
		Sample s2 = new Sample(75);
		Sample s3 = new Sample(100);
		System.out.println("main ends...");
	}
}
/*
main starts...
Execute constructer with int argument z : 66
Execute constructer with int argument z : 75
Execute constructer with int argument z : 100
main ends...
*/