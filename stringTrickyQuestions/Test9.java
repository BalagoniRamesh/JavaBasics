package stringTrickyQuestions;

public class Test9 {
	 public static void main(String[] args) {
		 
	 final String fName = "James";
	 String lName = "Gosling";
	 String name1 = fName + lName;  //heap memory area
	 
	 System.out.println(name1); 
	 
	 String name2 = fName + "Gosling"; // heap memory  final variable+string letral
	 System.out.println(name2);  
	 String name3 = "James" + "Gosling";  //heap	 
	 System.out.println(name3);  

	 System.out.println(name1 == name2);  //Here name1 & name 2 objects area different objects
	 System.out.println(name2 == name3);
//	 System.out.println(name1 == name3);
//	 
//	 System.out.println(System.identityHashCode(fName));
//	 System.out.println(System.identityHashCode(name2));
//	 System.out.println(System.identityHashCode(name3));
 //Here name3 point out to name1
	 
	/* The concatenation fName + lName is performed at runtime when the code is executed. This concatenation creates a new string object in the heap memory that holds the combined value of "JamesGosling".

Therefore, the resulting string "JamesGosling" is stored in the heap memory area, not in the String Constant Pool (SCP).
	 
	 */}
	 
}
