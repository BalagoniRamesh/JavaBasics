class D
{
	public int i = 10;
}
class E extends D 
{
	
	public double j = 5.7;
	public void show()
	{
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
}
class F extends D
{
    public double k = 2.3;
	public void result()
	{
	System.out.println("i : "+i);
	System.out.println("k : "+k);
	}
}
class MainClass5
{ 
	
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		new E().show();
		new F().result();
		System.out.println("main ends...");
	}
}
/*
main starts...
i : 10
j : 5.7
i : 10
k : 2.3
main ends...
*/