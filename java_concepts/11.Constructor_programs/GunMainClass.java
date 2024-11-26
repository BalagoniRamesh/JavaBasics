class GunMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Gun g1 = new Gun("pisthol",6);
		Gun g2 = new Gun("AKM",30);
		g1.shooting();
		g2.shooting();
		System.out.println("main ends...");
	}
}
