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












	