class GmailAccount 
{
	private String pwd;
	public void setPassword(String pwd) 
	{
		if(pwd.length()>=8)
		{
			this.pwd = pwd;
			System.out.println("password is set successfully");
		}
		else
		{
		System.out.println("password should be atleast 8characters");
		}
	}
}
class MainClass3
{
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		GmailAccount ga = new GmailAccount();
		ga.setPassword("jsp569133");
		System.out.println("main ends....");
	}
}
/*
	//ga.setPassword("jsp56");
main starts....
password should be atleast 8characters
main ends....
	//ga.setPassword("jsp569133");
main starts....
password is set successfully
main ends....
*/