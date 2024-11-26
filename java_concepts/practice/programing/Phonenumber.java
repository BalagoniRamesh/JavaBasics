import java.util.Scanner; 
class Phonenumber 
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
 if (count==10) 
 { 
 System.out.println(" valid mobile number:" +backup); 
 } 
 else
	 {
	 System.out.println("Not valid mobile number:" +backup); 
	 } 
 }
} 
/* 
Enter the number
1212121212
 valid mobile number:1212121212
 *************************************
 Enter the number
15526
Not valid mobile number:15526
*/ 