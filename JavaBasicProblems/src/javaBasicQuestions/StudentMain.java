package javaBasicQuestions;

public class StudentMain  {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 18, "A");
        Student student2 = new Student("Jane Smith", 17, "B");
        
        System.out.println("Student1 information: "); 
        student1.displayInfo();
        System.out.println("\nStudent2 information: "); 
        student2.displayInfo();
    }
}