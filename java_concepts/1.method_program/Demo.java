class Demo 
{
	public  void test()
	{
	System.out.println("take test");
	}
   
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		Demo d1=new Demo();
		d1.test();		
		System.out.println("main ends....");
	}
}

/*
main starts....
take test
main ends....
*/