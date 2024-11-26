class Gun 
{
	public String gName;
	public int bullets;
	public Gun(String gName, int bullets)
	{
		this.gName = gName;
		this.bullets = bullets;
	}
	public void shooting()
	{
		System.out.println("use: "+gName);
		for(int i = 1; i<= bullets; i++)
		{
			System.out.println("fire: "+i);
		}
	}
	
}
/*
main starts...
use: pisthol
fire: 1
fire: 2
fire: 3
fire: 4
fire: 5
fire: 6
use: AKM
fire: 1
fire: 2
fire: 3
fire: 4
fire: 5
fire: 6
fire: 7
fire: 8
fire: 9
fire: 10
fire: 11
fire: 12
fire: 13
fire: 14
fire: 15
fire: 16
fire: 17
fire: 18
fire: 19
fire: 20
fire: 21
fire: 22
fire: 23
fire: 24
fire: 25
fire: 26
fire: 27
fire: 28
fire: 29
fire: 30
main ends...
*/