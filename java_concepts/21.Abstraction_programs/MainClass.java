/* Step 1 and 2 */
interface Sample
{
	void test();
}
/* Step 3 and 4 */
class Demo implements Sample
{
	public void test() 
	{
		System.out.println("logic of test");
	}
}
/* Step 5, 6 and 7 */
class Run
{
	public static Sample giveObject() 
	{
		Sample s = new Demo();
		return s;
	}
}
/*Step 1,2,5,6 Java Document
* Below program written by User(Developer) i.e, step 7 and 8 */
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample rv = Run.giveObject();
		rv.test();
		System.out.println("main ends");
	}
}
/*
main starts
logic of test
main ends
*/