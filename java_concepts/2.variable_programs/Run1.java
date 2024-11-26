class Run1
{
	public static String str1 ="hi";
	public String str2 ="hello";

	public static void main(String[] args)
	{
		System.out.println("main starts...");
		String str3 ="Bye";
	    System.out.println(str3);
		System.out.println(str1);
		Run1 r1 = new Run1();
		System.out.println(r1.str2);
		System.out.println("main ends....");
	}

}

/*
main starts...
Bye
hi
hello
main ends....
*/