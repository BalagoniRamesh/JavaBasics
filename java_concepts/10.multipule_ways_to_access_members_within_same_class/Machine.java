class Machine 
{
	public int i =44;
	public int j =33;
	public void machine(int i, int j) 
	{
		System.out.println("machine working");
		
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Machine m1 = new Machine();
		m1.machine(66,77);
		System.out.println("main ends");
	}
}
/*
main starts
machine working
44
33
66
77
main ends
*/