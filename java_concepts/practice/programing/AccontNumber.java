import java.util.Scanner; 
class AccontNumber 
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
 if (count>=11 &&  count<=16 )  
 { 
 System.out.println("valid AccontNumber:" +backup); 
 } 
 

 else
	 {
	 System.out.println("Invalid AccontNumber:" +backup); 
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