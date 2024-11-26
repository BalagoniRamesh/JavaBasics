package bankSystemAtm;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account openAccount(int accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, name, initialBalance);
        accounts.add(account);
        return account;
    }
}