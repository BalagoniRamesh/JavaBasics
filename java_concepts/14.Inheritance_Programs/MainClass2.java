class M 
{
	public int i = 25;
	public double j = 6.5;
	public void show()
	{
		System.out.println("execute show");
	}
}
class N extends M
{
	public void result()
	{
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		show();
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		N n1 = new N();
		n1.result();
		System.out.println("main ends...");
	}
}

/*
main starts...
i: 25
j: 6.5
execute show
main ends...
*/