class U
{
	public double i = 7.6;
}
class V extends	U
{
	public double j = 1.2;
}
class W extends	V
{
	public int k = 21;
	public void print()
	{
		System.out.println("Super most class var i : " +i);
		System.out.println("Super class var j : " +j);
		System.out.println("Own var k : " +k);
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		W w1 = new W();
		w1.print();
		System.out.println("main ends...");
	}
}
/*
main starts...
Super most class var i : 7.6
Super class var j : 1.2
Own var k : 21
main ends...
*/