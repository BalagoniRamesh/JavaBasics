package javaBasicQuestions;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Doe", 1001, 500);
        employees[1] = new Employee("Jane Smith", 1002, 600);
        employees[2] = new Employee("Mike Johnson", 1003, 100);

        System.out.println("Before Applying Bonus:");
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
        }

        double bonusPercentage = 10.0; // Bonus percentage to apply
        for (Employee employee : employees) {
            employee.calculateBonus(bonusPercentage);
        }

        System.out.println("\nAfter Applying Bonus:");
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}
