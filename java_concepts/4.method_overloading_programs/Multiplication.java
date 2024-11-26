class Multiplication 
{
	public static void multiply(int a,double b) 
	{
		System.out.println("Multiply " +a+" X "+b+" = "+(a*b));
	}
	public static void multiply(double a,int b) 
	{
		System.out.println("Multiply " +a+" X "+b+" = "+(a*b));
	}
	public static void multiply(int a,int b, int c) 
	{
		System.out.println("Multiply "+a+" X "+b+" X "+c+" = "+(a*b*c));
	}
	public static void multiply(double a,double b, int c) 
	{
		System.out.println("Multiply "+a+" X "+b+" X "+c+" = "+(a*b*c));
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Multiplication multiplication = new Multiplication();
		multiplication.multiply(10, 3.4);
		multiplication.multiply(8.6, 12);
		multiply(10, 2, 5);
		multiply(3.4,5.4,22);
		System.out.println("main ends...");
	}
}
/*
main starts...
Multiply 10 X 3.4 = 34.0
Multiply 8.6 X 12 = 103.19999999999999
Multiply 10 X 2 X 5 = 100
Multiply 3.4 X 5.4 X 22 = 403.91999999999996
main ends...
*/