package bankSystemAtm;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Welcome to HDFC Bank! \nEnter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = bank.findCustomer(customerName);

        if (customer == null) {
            customer = bank.createCustomer(customerName);
            System.out.println("Welcome, " + customer.getName());
        } else {
            System.out.println("Welcome back, " + customer.getName() + "!");
        }

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Account account = null;
        for (Account acc : customer.getAccounts()) {
            if (acc.getAccountNumber() == accountNumber) {
                account = acc;
                break;
            }
        }

        if (account == null) {
//            System.out.println("Creating a new account...");
            System.out.print("Enter initial deposit amount: $");
            double initialDeposit = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            account = customer.openAccount(accountNumber, initialDeposit);
            System.out.println("Account created successfully!");
        }

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Account Holder: " + account.getAccountHolderName());
                    System.out.println("Account Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. Current Balance: $" + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    if (account.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. Current Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter recipient's account number: ");
                    int recipientAccountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Account recipientAccount = null;
                    for (Customer c : bank.getCustomers()) {
                        for (Account a : c.getAccounts()) {
                            if (a.getAccountNumber() == recipientAccountNumber) {
                                recipientAccount = a;
                                break;
                            }
                        }
                        if (recipientAccount != null) {
                            break;
                        }
                    }

                    if (recipientAccount != null) {
                        account.transfer(recipientAccount, transferAmount);
                        System.out.println("Transfer successful. Current Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Recipient's account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.calculateInterest(interestRate);
                    System.out.println("Interest calculated. Current Balance: $" + account.getBalance());
                    break;
                case 6:
                    System.out.println("Thank you for using XYZ Bank. Have a great day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

