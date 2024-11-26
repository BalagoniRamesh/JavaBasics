class  FlowerMainClass
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Flower f1 = new Flower("lilly");
		Flower f2 = new Flower("rose");
		Flower f3 = new Flower("califlower");
		f1.display();
		f2.display();
		f3.display();
		System.out.println("main ends...");
	}
}
