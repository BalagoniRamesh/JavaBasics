import java.util.Scanner; 
class OTP 
{ 
 public static void main(String[] args) 
 { 
 Scanner scan = new Scanner(System.in); 
 System.out.println("Enter the number"); 
 int num = scan.nextInt(); 
 int count =0;
 int backup = num; // initialy it will store 
 while(num!=0) 
 {  
 num = num/10; 
 count++; 
 }  
 if (count==4) 
 { 
 System.out.println("valid OTP:" +backup); 
 } 
else if (count==6) 
 { 
 System.out.println("valid OTP:" +backup); 
 } 
else if (count==8) 
 { 
 System.out.println("valid OTP:" +backup); 
 } 
 else
	 {
	 System.out.println("Invalid OTP:" +backup); 
	 } 
 }
} 
/* 
Enter the number
1234
valid OTP:1234
 *************************************
Enter the number
123456
valid OTP:123456
*/ 