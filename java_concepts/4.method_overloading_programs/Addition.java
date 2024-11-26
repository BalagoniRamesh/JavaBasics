class Addition 
{
	public static void add(int i,int j) 
	{
		System.out.println("Addition of");
		System.out.println("i: " +i);
		System.out.println("j: " +j);
		System.out.println("i+j= " +(i+j));
	}
	public static void add(double i, double j) 
	{
		System.out.println("Addition of");
		System.out.println("i: " +i);
		System.out.println("j: " +j);
		System.out.println("i+j=" +(i+j));
	}
	public static void add(int i,int j, int k) 
	{
		System.out.println("Addition of");
		System.out.println("i: " +i);
		System.out.println("j: " +j);
		System.out.println("k: " +k);
		System.out.println("i+j+k=" +(i+j+k));
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		add(6, 4);
		add(7.4, 1.2);
		
		add(6, 4,8);
		System.out.println("main ends...");
	}
}
/*
main starts...
Addition of
i: 6
j: 4
i+j= 10
Addition of
i: 7.4
j: 1.2
i+j=8.6
Addition of
i: 6
j: 4
k: 8
i+j+k=18
main ends...
*/