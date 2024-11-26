package atm;

import java.util.*;



public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account(123456, "John Doe", 1000.0);

        System.out.println("Welcome to the ATM, " + account.getAccountHolderName() + "!");
        System.out.println("Your account number is: " + account.getAccountNumber());

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. Current Balance: " + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    if (account.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. Current Balance: " + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
