package bankSystemAtm;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Customer> customers;

    public Bank() {
        this.setCustomers(new ArrayList<>());
    }

    public Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        getCustomers().add(customer);
        return customer;
    }

    public Customer findCustomer(String name) {
        for (Customer customer : getCustomers()) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}