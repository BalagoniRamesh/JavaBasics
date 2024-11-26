package stringTrickyQuestions;

public class Test7 extends String {
	 @Override
	 public String toString() {
	 return "TEST";
	 }
	 
	 public static void main(String[] args) {
	 Test7 obj = new Test7();
	 System.out.println(obj);
	 }
}
/*However, it's important to note that you cannot 
directly extend the String class in Java. The String 
class is marked as final, which means it cannot be subclassed.*/