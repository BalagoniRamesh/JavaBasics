package javaBasicQuestions;
import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. \nTotal Available balance: " + balance);

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal failed. \nInsufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. \nTotal Available balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        scanner.close();
    }
}

