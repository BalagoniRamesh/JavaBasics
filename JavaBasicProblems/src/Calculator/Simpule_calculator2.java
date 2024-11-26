package Calculator;
import java.util.Scanner;
class Simpule_calculator2
{
public static void main(String[] args)
{
	
Scanner scan = new Scanner(System.in);
System.out.println("Welcome to simple calculator");

System.out.println("Enter the 1 for Addition");
System.out.println("Enter the 2 for Subtraction");
System.out.println("Enter the 3 for Multiplication");
System.out.println("Enter the 4 for Division(Qoutient)");
System.out.println("Enter the 5 for Division(Reminder)");
System.out.println("Enter the 6 for Factorial");
System.out.println("Enter the 7 to check prime or not");
System.out.println("Enter the 8 to check Perfect number or not");
System.out.println("Enter the 9 to check Armstrong number or not");
System.out.println("Enter the 10 to check Strong number or not");
System.out.println("Enter the 11 to check Palindrom number or not");
System.out.println("Enter the 12 to check Magic number or not");
System.out.println("Enter the 13 to get Fibonacci series");
System.out.println("Enter the 14 for Multiplication table");
System.out.println("Enter the 15 for to check even or odd");
System.out.println("Enter the 16 to find HCF");
System.out.println("Enter the 17 to find LCM");
System.out.println("Enter the 18 to find Squareroot");
System.out.println("Enter the 19 to find day of the week");
while(true) {
System.out.println("Enter the number");
int num = scan.nextInt();
switch (num)
{
//Addition
case 1: System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		{
			System.out.println(a+" + "+b+" = "+(a+b));
		}
//Subtraction
case 2: System.out.println("Enter the first number");
		int d = scan.nextInt();
		System.out.println("Enter the second number");
		int e = scan.nextInt();
		{
			System.out.println(d+" - "+e+" = "+(d-e));
		}
//Multiplication
case 3: System.out.println("Enter the first number");
		int f = scan.nextInt();
		System.out.println("Enter the second number");
		int g = scan.nextInt();
		{
			System.out.println(f+" * "+g+" = "+(f*g));
		}
//Division(Qoutient)
case 4: System.out.println("Enter the first number");
		int h = scan.nextInt();
		System.out.println("Enter the second number");
		int i = scan.nextInt();
		{
			System.out.println(h+" / "+i+" = "+(h/i)); //4 / 2 = 2
		}
//Division(Reminder)
case 5:	System.out.println("Enter the first number");
		int j = scan.nextInt();
		System.out.println("Enter the second number");
		int k = scan.nextInt();
		{
			System.out.println(j+" % "+k+" = "+(j%k)); //3 % 2 = 1
		}
//Factorial
case 6: System.out.println("Enter the number");
		int num1 = scan.nextInt();
		int fact =1;
		for (int l=1; l<=num1; l++)
		{
			fact= fact*l;
		}
		System.out.println("factorial value:"+fact); //5 factorial value:120
//check prime or not
case 7: System.out.println("Enter the number");
		int num2 = scan.nextInt();		
		int count=0;
		for (int m=1; m<=num2; m++)		
		{
			if(num%m==0)
			{
				count++;
			}
		}		
		if (count==2)		
		{
			System.out.println("Given no is prime number");//5 Given no is not a prime number
		}
		else
		{
			System.out.println("Given no is not a prime number"); //6 Given no is not a prime number
		}
//check Perfect number or not
case 8: System.out.println("Enter the number");		
		int num3 = scan.nextInt();		
		int sum=0;
		for (int n=1; n<num3; n++)		
		{
			if(num3%n==0)
			{
				sum= sum+n; //add factors
			}
		}
		if(sum==num3)
		{		
			System.out.println("given no is perfect number"); //6 given no is perfect number
		}
		else
		{
			System.out.println("given no is not perfect number"); //5 given no is not perfect number
		}
//check Armstrong number or not
case 9: System.out.println("Enter the number");		
		int num4 = scan.nextInt();
		int power =0;
		int lastdigit =0;
		int product =1;
		int sum1 =0;
		int backup = num4; // initialy it will store		
		while(num4!=0)		
		{		
			power++;
			num4 = num4/10;		
		}
		num4=backup;
		while(num4!=0)
		{		
			lastdigit = num4%10;
			for (int o=1; o<=power; o++ )
			{
			product=product*lastdigit;
			}			
			sum1=sum1+product;
			product=1;
			num4 = num4/10;		
		}
		if(backup == sum1)
		{
			System.out.println("Given no is armstrong number");//153 Given no is armstrong number
		}
		else
		{
			System.out.println("given no is not armstrong number"); //145 given no is not armstrong number
		}
//check Strong number or not
case 10:System.out.println("Enter the number");		
		int num5 = scan.nextInt();
		int lastdigit1 =0;
		int sum2 =0;
		int backup1 = num5; // initialy it will store		
		while(num5!=0)		
		{
			lastdigit1 = num5%10;
			int fact1 =1;			
			for (int p=1; p<=lastdigit1; p++)			
			{			
				fact1= fact1*p;			
			}
			sum2=sum2+fact1;
			fact1=1;
			num5 = num5/10;		
		}
		if(backup1 == sum2)		
		{		
			System.out.println("Given no is strong number"); //145 Given no is strong number
		}
		else
		{
			System.out.println("Given no not is strong number"); //140 Given no not is strong number
		}
//check Palindrom number or not
case 11:System.out.println("Enter the number");
		int num6 = scan.nextInt();
		int backup2 = num6; // initialy it will store 121 it will not change, and then while loop performed
		int lastdigit2 =0;
		int reverse =0;
		while(num6!=0)
		{		
		lastdigit2 = num6%10;
		reverse=reverse*10+lastdigit2;		
		num6 = num6/10;		
		}
		if(backup2 == reverse)
		{
			System.out.print("Given no is palindrome number"); //121 Given no is palindrome number
		}
		else
		{
			System.out.print("Given no not a palindrome number"); //123 Given no not a palindrome number
		}
		System.out.println();
//check Magic number or not
case 12:System.out.println("Enter the number");		
		int num7 = scan.nextInt();		
		int lastdigit3 =0;
		int sum3 =0;
		while(num7>=10)
		{		
			while(num7!=0)		
			{
				lastdigit3 = num7%10;
				sum3=sum3 + lastdigit3;
				num7 = num7/10;			
			}
			num7 = sum3;
			sum3 = 0;		
		}
		if(num7==1)
		{
			System.out.println("Given no is Magic number "); //253 2Given no is Magic number
		}
		else		
		{		
			System.out.println("Given no is Not a Magic number "); //123 Given no is Not a Magic number
		}
		
//get Fibonacci series
case 13:System.out.println("Enter the number of terms you wish to print");
		int num8 = scan.nextInt();		
		int q =0;
		int r =1;
		int s =0;
		for (int t=1; t<=num8; t++)
		{		
			System.out.print(s+",");//Enter the number of terms you wish to print 8 0,1,1,2,3,5,8,13,
			q=r;
			r=s;
			s=q+r;		
		}		
		System.out.println();
//to check even or odd
case 14:System.out.println("Enter the number");
		int u = scan.nextInt();
		for (int v=1; v<=10; v++)		
		{
			//int c=b*u;
			{			
				System.out.print(u+" * "+v+" = "+(u*v)); //Enter the number (((2))) 2 * 1 = 22 * 2 = 42 * 3 = 62 * 4 = 82 * 5 = 102 * 6 = 122 * 7 = 142 * 8 = 162 * 9 = 182 * 10 = 20P
			}
		}
//to check even or odd
case 15:System.out.println("Enter the number");
		int w = scan.nextInt();		
		if (w%2==0)
		{		
			System.out.println("Given number is even: "+w); //Given number is even: 2
		}
		else
		{
			System.out.println("Given number is odd: "+w); //Given number is odd: 3
		}
//find HCF
case 16:System.out.println("Enter for how many numbers you like to find ");
		int num9 = scan.nextInt();		
		int HCF = 1;
		int temp = 0;		
		for (int x=1; x<=num9; x++)
		{		
			System.out.println("Enter number: " +x);			
			int n = scan.nextInt();
			if(x==1)
			{			
				temp = n;			
			}
			for (int y=1; y<=n; y++)
			if(temp%y==0&&n%y==0)			
			{			
				HCF = y;			
			}			
			temp = HCF;		
		}		
		System.out.println("HCF of given number is: " +HCF); //Enter for how many numbers you like to find
		// 2
		// Enter number : 1		
		// 6
		// Enter number : 2
		// 12
		// HCF of given number is: 6		
		}
}
//		System.out.println("Would like to continue");
//		System.out.println("Enter Y to continue");
//		System.out.println("Enter N to Exit");
//		System.out.println("Thank you visit again");		
		}
}
