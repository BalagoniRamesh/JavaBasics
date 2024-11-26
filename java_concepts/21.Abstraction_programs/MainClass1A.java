/* Step 1 and 2 */    //1B Abstraction by using abstract class Non-static-method
abstract class A
{
	abstract public void move();
}
/* Step 3 and 4 */
class B extends A
{
	public void move() 
	{
		System.out.println("logic completed");
	}
}
/* Step 5, 6 and 7 */
class Z
{
	public A fetchObject() 
	{
		A a = new B();
		return a;
	}
}
/*Step 1,2,5,6 Java Document
* Below program written by User(Developer) i.e, step 7 and 8 */
class MainClass1A 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Z z1 = new Z();
		A rv = z1.fetchObject();
		rv.move();
		System.out.println("main ends");
	}
}
/*
main starts
logic completed
main ends
	Z z1 = new Z();
	//1st way to call to non-ststic-method
		A rv = z1.fetchObject();
		rv.move();
//2nd way to call to non-ststic-method(out put not getting)
		A rv1 = new Z().fetchObject().move();
		rv1.move();

//3rd way to call to non-ststic-method
new Z().fetchObject().move();
main starts
logic completed
main ends
*/