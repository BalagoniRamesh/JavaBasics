class Demo
{
	public static int k =100;
	public int z=45; 
}
class Sample
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(Demo.k);
		Demo demo = new Demo();
		System.out.println(demo.z);
		
		System.out.println("main ends...");
	}
}

/*
main starts...
100
45
main ends...
*/